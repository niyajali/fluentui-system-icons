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

package fluent.ui.system.icons.filled

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
 * LinkToolbox Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in generic linking to other content scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_link_toolbox_20_filled.svg)
 * 
 * @return The [ImageVector] for the LinkToolbox icon.
 */
public val FluentIcons.Filled.LinkToolbox: ImageVector
    get() {
        if (_linkToolbox != null) {
            return _linkToolbox!!
        }
        _linkToolbox = Builder(name = "LinkToolbox", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.75f, 4.75f)
                curveTo(8.75f, 4.336f, 8.414f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(6.0f)
                lineTo(5.8f, 4.005f)
                curveTo(3.684f, 4.109f, 2.0f, 5.858f, 2.0f, 8.0f)
                curveTo(2.0f, 10.209f, 3.791f, 12.0f, 6.0f, 12.0f)
                horizontalLineTo(8.0f)
                lineTo(8.102f, 11.993f)
                curveTo(8.468f, 11.943f, 8.75f, 11.63f, 8.75f, 11.25f)
                curveTo(8.75f, 10.836f, 8.414f, 10.5f, 8.0f, 10.5f)
                horizontalLineTo(6.0f)
                lineTo(5.836f, 10.495f)
                curveTo(4.532f, 10.41f, 3.5f, 9.325f, 3.5f, 8.0f)
                curveTo(3.5f, 6.619f, 4.619f, 5.5f, 6.0f, 5.5f)
                horizontalLineTo(8.0f)
                lineTo(8.102f, 5.493f)
                curveTo(8.468f, 5.443f, 8.75f, 5.13f, 8.75f, 4.75f)
                close()
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 5.791f, 16.209f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(12.0f)
                lineTo(11.898f, 4.007f)
                curveTo(11.532f, 4.057f, 11.25f, 4.37f, 11.25f, 4.75f)
                curveTo(11.25f, 5.164f, 11.586f, 5.5f, 12.0f, 5.5f)
                horizontalLineTo(14.0f)
                lineTo(14.164f, 5.505f)
                curveTo(15.469f, 5.59f, 16.5f, 6.675f, 16.5f, 8.0f)
                curveTo(16.5f, 8.399f, 16.406f, 8.777f, 16.24f, 9.111f)
                curveTo(16.738f, 9.265f, 17.169f, 9.571f, 17.48f, 9.974f)
                curveTo(17.811f, 9.391f, 18.0f, 8.718f, 18.0f, 8.0f)
                close()
                moveTo(6.25f, 7.25f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 7.25f, 14.5f, 7.586f, 14.5f, 8.0f)
                curveTo(14.5f, 8.38f, 14.218f, 8.693f, 13.852f, 8.743f)
                lineTo(13.75f, 8.75f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 8.75f, 5.5f, 8.414f, 5.5f, 8.0f)
                curveTo(5.5f, 7.62f, 5.782f, 7.307f, 6.148f, 7.257f)
                lineTo(6.25f, 7.25f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineTo(11.5f)
                curveTo(12.0f, 10.672f, 12.672f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(15.5f)
                curveTo(16.328f, 10.0f, 17.0f, 10.672f, 17.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                curveTo(18.328f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                curveTo(17.0f, 14.224f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 14.224f, 16.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                curveTo(13.0f, 14.224f, 12.776f, 14.0f, 12.5f, 14.0f)
                curveTo(12.224f, 14.0f, 12.0f, 14.224f, 12.0f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 12.672f, 10.672f, 12.0f, 11.5f, 12.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.0f, 11.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.5f)
                curveTo(16.0f, 11.224f, 15.776f, 11.0f, 15.5f, 11.0f)
                horizontalLineTo(13.5f)
                curveTo(13.224f, 11.0f, 13.0f, 11.224f, 13.0f, 11.5f)
                close()
                moveTo(17.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 18.328f, 18.328f, 19.0f, 17.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 16.776f, 12.224f, 17.0f, 12.5f, 17.0f)
                curveTo(12.776f, 17.0f, 13.0f, 16.776f, 13.0f, 16.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 16.776f, 16.224f, 17.0f, 16.5f, 17.0f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                close()
            }
        }
        .build()
        return _linkToolbox!!
    }

@Suppress("ObjectPropertyName")
private var _linkToolbox: ImageVector? = null

@Preview
@Composable
private fun LinkToolboxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LinkToolbox, contentDescription = "LinkToolbox Icon")
    }
}

