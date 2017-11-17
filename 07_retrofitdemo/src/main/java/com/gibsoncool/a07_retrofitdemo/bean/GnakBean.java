package com.gibsoncool.a07_retrofitdemo.bean;

import java.util.List;

/**
 * Created by GibsonCool on 2017/11/17
 */

public class GnakBean
{
	private boolean          error;
	private List<ResultBean> results;

	public boolean isError()
	{
		return error;
	}

	public void setError(boolean error)
	{
		this.error = error;
	}

	public List<ResultBean> getResults()
	{
		return results;
	}

	public void setResults(List<ResultBean> results)
	{
		this.results = results;
	}

	public class ResultBean
	{
		private String       _id;
		private String       createdAt;
		private String       desc;
		private String       publishedAt;
		private String       source;
		private String       type;
		private String       url;
		private boolean      used;
		private String       who;
		private List<String> images;

		public String get_id()
		{
			return _id;
		}

		public void set_id(String _id)
		{
			this._id = _id;
		}

		public String getCreatedAt()
		{
			return createdAt;
		}

		public void setCreatedAt(String createdAt)
		{
			this.createdAt = createdAt;
		}

		public String getDesc()
		{
			return desc;
		}

		public void setDesc(String desc)
		{
			this.desc = desc;
		}

		public String getPublishedAt()
		{
			return publishedAt;
		}

		public void setPublishedAt(String publishedAt)
		{
			this.publishedAt = publishedAt;
		}

		public String getSource()
		{
			return source;
		}

		public void setSource(String source)
		{
			this.source = source;
		}

		public String getType()
		{
			return type;
		}

		public void setType(String type)
		{
			this.type = type;
		}

		public String getUrl()
		{
			return url;
		}

		public void setUrl(String url)
		{
			this.url = url;
		}

		public boolean isUsed()
		{
			return used;
		}

		public void setUsed(boolean used)
		{
			this.used = used;
		}

		public String getWho()
		{
			return who;
		}

		public void setWho(String who)
		{
			this.who = who;
		}

		public List<String> getImages()
		{
			return images;
		}

		public void setImages(List<String> images)
		{
			this.images = images;
		}

		@Override
		public String toString()
		{
			return "ResultBean{" +
					"_id='" + _id + '\'' +
					", createdAt='" + createdAt + '\'' +
					", desc='" + desc + '\'' +
					", publishedAt='" + publishedAt + '\'' +
					", source='" + source + '\'' +
					", type='" + type + '\'' +
					", url='" + url + '\'' +
					", used=" + used +
					", who='" + who + '\'' +
					", images=" + images +
					'}';
		}
	}

	@Override
	public String toString()
	{
		return "GnakBean{" +
				"error=" + error +
				", results=" + results +
				'}';
	}
}
