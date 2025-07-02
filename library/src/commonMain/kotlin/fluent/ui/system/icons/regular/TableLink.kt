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
 * TableLink icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: table, link
 * - Source: ic_fluent_table_link_24_regular.svg
 * 
 * @return The [ImageVector] for the TableLink icon.
 */
public val FluentIcons.Regular.TableLink: ImageVector
    get() {
        if (_tableLink != null) {
            return _tableLink!!
        }
        _tableLink = Builder(name = "TableLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(14.333f)
                curveTo(20.532f, 14.147f, 20.027f, 14.034f, 19.5f, 14.007f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 14.007f)
                curveTo(15.108f, 14.027f, 14.729f, 14.095f, 14.368f, 14.204f)
                curveTo(14.243f, 14.242f, 14.12f, 14.285f, 14.0f, 14.333f)
                curveTo(13.344f, 14.593f, 12.76f, 14.994f, 12.286f, 15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.059f)
                curveTo(11.144f, 20.035f, 11.318f, 20.54f, 11.566f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 10.0f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 10.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 15.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(19.25f, 15.0f)
                curveTo(21.321f, 15.0f, 23.0f, 16.679f, 23.0f, 18.75f)
                curveTo(23.0f, 20.754f, 21.428f, 22.391f, 19.452f, 22.495f)
                lineTo(19.253f, 22.5f)
                verticalLineTo(22.505f)
                curveTo(18.839f, 22.507f, 18.502f, 22.172f, 18.5f, 21.758f)
                curveTo(18.498f, 21.378f, 18.779f, 21.063f, 19.145f, 21.012f)
                lineTo(19.247f, 21.005f)
                lineTo(19.25f, 21.0f)
                curveTo(20.493f, 21.0f, 21.5f, 19.993f, 21.5f, 18.75f)
                curveTo(21.5f, 17.559f, 20.575f, 16.584f, 19.404f, 16.505f)
                lineTo(19.25f, 16.5f)
                curveTo(18.836f, 16.5f, 18.5f, 16.164f, 18.5f, 15.75f)
                curveTo(18.5f, 15.37f, 18.782f, 15.057f, 19.148f, 15.007f)
                lineTo(19.25f, 15.0f)
                close()
                moveTo(15.75f, 15.0f)
                curveTo(16.164f, 15.0f, 16.5f, 15.336f, 16.5f, 15.75f)
                curveTo(16.5f, 16.13f, 16.218f, 16.444f, 15.852f, 16.493f)
                lineTo(15.75f, 16.5f)
                curveTo(14.507f, 16.5f, 13.5f, 17.507f, 13.5f, 18.75f)
                curveTo(13.5f, 19.941f, 14.425f, 20.916f, 15.596f, 20.995f)
                lineTo(15.75f, 21.0f)
                curveTo(16.164f, 21.0f, 16.5f, 21.336f, 16.5f, 21.75f)
                curveTo(16.5f, 22.13f, 16.218f, 22.444f, 15.852f, 22.493f)
                lineTo(15.75f, 22.5f)
                curveTo(13.679f, 22.5f, 12.0f, 20.821f, 12.0f, 18.75f)
                curveTo(12.0f, 16.746f, 13.572f, 15.109f, 15.551f, 15.005f)
                lineTo(15.75f, 15.0f)
                close()
                moveTo(19.25f, 18.0f)
                curveTo(19.664f, 18.0f, 20.0f, 18.336f, 20.0f, 18.75f)
                curveTo(20.0f, 19.13f, 19.718f, 19.444f, 19.352f, 19.493f)
                lineTo(19.25f, 19.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 19.5f, 15.0f, 19.164f, 15.0f, 18.75f)
                curveTo(15.0f, 18.37f, 15.282f, 18.056f, 15.648f, 18.007f)
                lineTo(15.75f, 18.0f)
                horizontalLineTo(19.25f)
                close()
            }
        }
        .build()
        return _tableLink!!
    }

@Suppress("ObjectPropertyName")
private var _tableLink: ImageVector? = null

@Preview
@Composable
private fun TableLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableLink, contentDescription = null)
    }
}

