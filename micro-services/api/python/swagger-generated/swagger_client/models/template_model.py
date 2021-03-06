# coding: utf-8

"""
    QES Quant Service API

    QES Quant Service API provides easy access to Risk/Optimization API   # noqa: E501

    OpenAPI spec version: 0.0.4
    Contact: luo.qes@wolferesearch.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class TemplateModel(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'type': 'str',
        'owner': 'str',
        'name': 'str',
        'description': 'str',
        'modified_date': 'str',
        'content': 'str'
    }

    attribute_map = {
        'type': 'TYPE',
        'owner': 'OWNER',
        'name': 'NAME',
        'description': 'DESCRIPTION',
        'modified_date': 'MODIFIED_DATE',
        'content': 'CONTENT'
    }

    def __init__(self, type=None, owner=None, name=None, description=None, modified_date=None, content=None):  # noqa: E501
        """TemplateModel - a model defined in Swagger"""  # noqa: E501

        self._type = None
        self._owner = None
        self._name = None
        self._description = None
        self._modified_date = None
        self._content = None
        self.discriminator = None

        if type is not None:
            self.type = type
        if owner is not None:
            self.owner = owner
        if name is not None:
            self.name = name
        if description is not None:
            self.description = description
        if modified_date is not None:
            self.modified_date = modified_date
        if content is not None:
            self.content = content

    @property
    def type(self):
        """Gets the type of this TemplateModel.  # noqa: E501

        Applicable Process - Risk-Model, Optimization  # noqa: E501

        :return: The type of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this TemplateModel.

        Applicable Process - Risk-Model, Optimization  # noqa: E501

        :param type: The type of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._type = type

    @property
    def owner(self):
        """Gets the owner of this TemplateModel.  # noqa: E501

        Template Creator  # noqa: E501

        :return: The owner of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner):
        """Sets the owner of this TemplateModel.

        Template Creator  # noqa: E501

        :param owner: The owner of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._owner = owner

    @property
    def name(self):
        """Gets the name of this TemplateModel.  # noqa: E501

        Unique Name  # noqa: E501

        :return: The name of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this TemplateModel.

        Unique Name  # noqa: E501

        :param name: The name of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def description(self):
        """Gets the description of this TemplateModel.  # noqa: E501

        Descriptive Text  # noqa: E501

        :return: The description of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this TemplateModel.

        Descriptive Text  # noqa: E501

        :param description: The description of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._description = description

    @property
    def modified_date(self):
        """Gets the modified_date of this TemplateModel.  # noqa: E501

        Timestamp of last modified  # noqa: E501

        :return: The modified_date of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._modified_date

    @modified_date.setter
    def modified_date(self, modified_date):
        """Sets the modified_date of this TemplateModel.

        Timestamp of last modified  # noqa: E501

        :param modified_date: The modified_date of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._modified_date = modified_date

    @property
    def content(self):
        """Gets the content of this TemplateModel.  # noqa: E501

        Template Content  # noqa: E501

        :return: The content of this TemplateModel.  # noqa: E501
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this TemplateModel.

        Template Content  # noqa: E501

        :param content: The content of this TemplateModel.  # noqa: E501
        :type: str
        """

        self._content = content

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(TemplateModel, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TemplateModel):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
