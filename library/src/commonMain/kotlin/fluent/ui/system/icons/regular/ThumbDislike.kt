/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ThumbDislike Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used in general approval/disapproval scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_thumb_dislike_24_regular.svg)
 * 
 * @return The [ImageVector] for the ThumbDislike icon.
 */
public val FluentIcons.Regular.ThumbDislike: ImageVector
    get() {
        if (_thumbDislike != null) {
            return _thumbDislike!!
        }
        _thumbDislike = Builder(name = "ThumbDislike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 17.985f)
                curveTo(16.5f, 20.427f, 15.359f, 22.184f, 13.493f, 22.184f)
                curveTo(12.518f, 22.184f, 12.152f, 21.641f, 11.802f, 20.388f)
                lineTo(11.596f, 19.616f)
                curveTo(11.495f, 19.257f, 11.319f, 18.647f, 11.069f, 17.785f)
                curveTo(11.062f, 17.762f, 11.052f, 17.74f, 11.04f, 17.72f)
                lineTo(8.173f, 13.235f)
                curveTo(7.495f, 12.174f, 6.494f, 11.358f, 5.318f, 10.908f)
                lineTo(4.845f, 10.727f)
                curveTo(3.598f, 10.249f, 2.875f, 8.946f, 3.129f, 7.635f)
                lineTo(3.533f, 5.549f)
                curveTo(3.775f, 4.304f, 4.718f, 3.313f, 5.95f, 3.011f)
                lineTo(13.578f, 1.142f)
                curveTo(16.109f, 0.521f, 18.667f, 2.056f, 19.311f, 4.581f)
                lineTo(20.726f, 10.131f)
                curveTo(21.17f, 11.87f, 20.119f, 13.639f, 18.38f, 14.083f)
                curveTo(18.118f, 14.15f, 17.848f, 14.184f, 17.577f, 14.184f)
                horizontalLineTo(15.754f)
                curveTo(16.25f, 15.816f, 16.5f, 17.076f, 16.5f, 17.985f)
                close()
                moveTo(4.601f, 7.921f)
                curveTo(4.486f, 8.516f, 4.815f, 9.109f, 5.381f, 9.326f)
                lineTo(5.855f, 9.507f)
                curveTo(7.33f, 10.072f, 8.586f, 11.095f, 9.437f, 12.427f)
                lineTo(12.304f, 16.913f)
                curveTo(12.394f, 17.053f, 12.463f, 17.206f, 12.509f, 17.367f)
                lineTo(13.061f, 19.287f)
                lineTo(13.273f, 20.079f)
                curveTo(13.413f, 20.567f, 13.483f, 20.684f, 13.493f, 20.684f)
                curveTo(14.361f, 20.684f, 15.0f, 19.7f, 15.0f, 17.985f)
                curveTo(15.0f, 17.101f, 14.674f, 15.65f, 14.016f, 13.67f)
                curveTo(13.854f, 13.185f, 14.216f, 12.684f, 14.727f, 12.684f)
                horizontalLineTo(17.577f)
                curveTo(17.723f, 12.684f, 17.868f, 12.665f, 18.009f, 12.629f)
                curveTo(18.946f, 12.391f, 19.511f, 11.438f, 19.273f, 10.501f)
                lineTo(17.858f, 4.952f)
                curveTo(17.417f, 3.224f, 15.667f, 2.174f, 13.935f, 2.598f)
                lineTo(6.307f, 4.468f)
                curveTo(5.644f, 4.631f, 5.136f, 5.164f, 5.006f, 5.835f)
                lineTo(4.601f, 7.921f)
                close()
            }
        }
        .build()
        return _thumbDislike!!
    }

@Suppress("ObjectPropertyName")
private var _thumbDislike: ImageVector? = null

@Preview
@Composable
private fun ThumbDislikePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ThumbDislike, contentDescription = "ThumbDislike Icon")
    }
}

