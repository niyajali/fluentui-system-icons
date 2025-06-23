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

public val FluentIcons.Filled.AttachText: ImageVector
    get() {
        if (_AttachText != null) {
            return _AttachText!!
        }
        _AttachText = ImageVector.Builder(
            name = "Filled.AttachText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 3f)
                curveTo(9.689f, 3f, 11.882f, 5.122f, 11.995f, 7.783f)
                lineTo(12f, 8f)
                verticalLineTo(19f)
                curveTo(12f, 20.657f, 10.657f, 22f, 9f, 22f)
                curveTo(7.402f, 22f, 6.096f, 20.751f, 6.005f, 19.176f)
                lineTo(6f, 19f)
                verticalLineTo(9f)
                curveTo(6f, 8.448f, 6.448f, 8f, 7f, 8f)
                curveTo(7.513f, 8f, 7.936f, 8.386f, 7.993f, 8.883f)
                lineTo(8f, 9f)
                verticalLineTo(19f)
                curveTo(8f, 19.552f, 8.448f, 20f, 9f, 20f)
                curveTo(9.513f, 20f, 9.936f, 19.614f, 9.993f, 19.117f)
                lineTo(10f, 19f)
                verticalLineTo(8f)
                curveTo(10f, 6.343f, 8.657f, 5f, 7f, 5f)
                curveTo(5.402f, 5f, 4.096f, 6.249f, 4.005f, 7.824f)
                lineTo(4f, 8f)
                verticalLineTo(17f)
                curveTo(4f, 17.552f, 3.552f, 18f, 3f, 18f)
                curveTo(2.487f, 18f, 2.064f, 17.614f, 2.007f, 17.117f)
                lineTo(2f, 17f)
                verticalLineTo(8f)
                curveTo(2f, 5.239f, 4.239f, 3f, 7f, 3f)
                close()
                moveTo(15f, 17f)
                horizontalLineTo(17f)
                curveTo(17.552f, 17f, 18f, 17.448f, 18f, 18f)
                curveTo(18f, 18.513f, 17.614f, 18.935f, 17.117f, 18.993f)
                lineTo(17f, 19f)
                horizontalLineTo(15f)
                curveTo(14.448f, 19f, 14f, 18.552f, 14f, 18f)
                curveTo(14f, 17.487f, 14.386f, 17.065f, 14.883f, 17.007f)
                lineTo(15f, 17f)
                horizontalLineTo(17f)
                horizontalLineTo(15f)
                close()
                moveTo(15f, 13f)
                horizontalLineTo(20.5f)
                curveTo(21.052f, 13f, 21.5f, 13.448f, 21.5f, 14f)
                curveTo(21.5f, 14.513f, 21.114f, 14.936f, 20.617f, 14.993f)
                lineTo(20.5f, 15f)
                horizontalLineTo(15f)
                curveTo(14.448f, 15f, 14f, 14.552f, 14f, 14f)
                curveTo(14f, 13.487f, 14.386f, 13.064f, 14.883f, 13.007f)
                lineTo(15f, 13f)
                horizontalLineTo(20.5f)
                horizontalLineTo(15f)
                close()
                moveTo(15f, 9f)
                horizontalLineTo(20.5f)
                curveTo(21.052f, 9f, 21.5f, 9.448f, 21.5f, 10f)
                curveTo(21.5f, 10.513f, 21.114f, 10.936f, 20.617f, 10.993f)
                lineTo(20.5f, 11f)
                horizontalLineTo(15f)
                curveTo(14.448f, 11f, 14f, 10.552f, 14f, 10f)
                curveTo(14f, 9.487f, 14.386f, 9.064f, 14.883f, 9.007f)
                lineTo(15f, 9f)
                horizontalLineTo(20.5f)
                horizontalLineTo(15f)
                close()
                moveTo(15f, 5f)
                horizontalLineTo(20.5f)
                curveTo(21.052f, 5f, 21.5f, 5.448f, 21.5f, 6f)
                curveTo(21.5f, 6.513f, 21.114f, 6.936f, 20.617f, 6.993f)
                lineTo(20.5f, 7f)
                horizontalLineTo(15f)
                curveTo(14.448f, 7f, 14f, 6.552f, 14f, 6f)
                curveTo(14f, 5.487f, 14.386f, 5.064f, 14.883f, 5.007f)
                lineTo(15f, 5f)
                horizontalLineTo(20.5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _AttachText!!
    }

@Suppress("ObjectPropertyName")
private var _AttachText: ImageVector? = null

@Preview
@Composable
private fun AttachTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AttachText, contentDescription = null)
    }
}
