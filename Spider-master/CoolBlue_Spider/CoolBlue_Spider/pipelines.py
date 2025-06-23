# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html


from scrapy.exceptions import DropItem


# This pipeline will make sure the final csv doesnt have duplicate items
class DuplicatesPipeline(object):

    def __init__(self):

        self.urls_seen = set()

    def process_item(self, item, spider):

        if item['Url'] in self.urls_seen:

            raise DropItem("Duplicate URL found: %s" % item)

        else:

            self.urls_seen.add(item['Url'])

            return item
