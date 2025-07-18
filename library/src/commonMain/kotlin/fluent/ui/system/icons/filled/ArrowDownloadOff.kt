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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ArrowDownloadOff: ImageVector
    get() {
        if (_ArrowDownloadOff != null) {
            return _ArrowDownloadOff!!
        }
        _ArrowDownloadOff = ImageVector.Builder(
            name = "Filled.ArrowDownloadOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 12.061f)
                verticalLineTo(15.086f)
                lineTo(7.707f, 11.793f)
                curveTo(7.317f, 11.402f, 6.683f, 11.402f, 6.293f, 11.793f)
                curveTo(5.902f, 12.183f, 5.902f, 12.817f, 6.293f, 13.207f)
                lineTo(11.293f, 18.207f)
                curveTo(11.683f, 18.598f, 12.317f, 18.598f, 12.707f, 18.207f)
                lineTo(14.927f, 15.988f)
                lineTo(18.939f, 20f)
                horizontalLineTo(5f)
                curveTo(4.448f, 20f, 4f, 20.448f, 4f, 21f)
                curveTo(4f, 21.552f, 4.448f, 22f, 5f, 22f)
                horizontalLineTo(19f)
                curveTo(19.532f, 22f, 19.968f, 21.584f, 19.998f, 21.059f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(11f, 12.061f)
                close()
                moveTo(13.512f, 14.573f)
                lineTo(13f, 15.086f)
                verticalLineTo(14.061f)
                lineTo(13.512f, 14.573f)
                close()
                moveTo(17.048f, 13.866f)
                lineTo(15.634f, 12.452f)
                lineTo(16.293f, 11.793f)
                curveTo(16.683f, 11.402f, 17.317f, 11.402f, 17.707f, 11.793f)
                curveTo(18.098f, 12.183f, 18.098f, 12.817f, 17.707f, 13.207f)
                lineTo(17.048f, 13.866f)
                close()
                moveTo(11f, 7.818f)
                lineTo(13f, 9.818f)
                verticalLineTo(3f)
                curveTo(13f, 2.448f, 12.552f, 2f, 12f, 2f)
                curveTo(11.448f, 2f, 11f, 2.448f, 11f, 3f)
                verticalLineTo(7.818f)
                close()
            }
        }.build()

        return _ArrowDownloadOff!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownloadOff: ImageVector? = null

@Preview
@Composable
private fun ArrowDownloadOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowDownloadOff, contentDescription = null)
    }
}
