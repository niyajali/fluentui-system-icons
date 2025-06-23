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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ScanTypeOff: ImageVector
    get() {
        if (_ScanTypeOff != null) {
            return _ScanTypeOff!!
        }
        _ScanTypeOff = ImageVector.Builder(
            name = "Regular.ScanTypeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.483f, 3.544f)
                curveTo(2.177f, 4.04f, 2f, 4.624f, 2f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
                curveTo(3.164f, 9f, 3.5f, 8.664f, 3.5f, 8.25f)
                verticalLineTo(5.25f)
                curveTo(3.5f, 5.044f, 3.536f, 4.846f, 3.601f, 4.662f)
                lineTo(7f, 8.061f)
                verticalLineTo(9f)
                curveTo(7f, 9.414f, 7.336f, 9.75f, 7.75f, 9.75f)
                curveTo(8.005f, 9.75f, 8.231f, 9.622f, 8.366f, 9.427f)
                lineTo(11.25f, 12.311f)
                verticalLineTo(15.5f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 15.5f, 9f, 15.836f, 9f, 16.25f)
                curveTo(9f, 16.664f, 9.336f, 17f, 9.75f, 17f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 17f, 15f, 16.664f, 15f, 16.25f)
                curveTo(15f, 16.173f, 14.988f, 16.098f, 14.966f, 16.027f)
                lineTo(19.338f, 20.399f)
                curveTo(19.154f, 20.464f, 18.956f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 20.5f, 15f, 20.836f, 15f, 21.25f)
                curveTo(15f, 21.664f, 15.336f, 22f, 15.75f, 22f)
                horizontalLineTo(18.75f)
                curveTo(19.376f, 22f, 19.96f, 21.823f, 20.456f, 21.517f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(2.483f, 3.544f)
                close()
                moveTo(14.473f, 15.534f)
                curveTo(14.402f, 15.512f, 14.328f, 15.5f, 14.25f, 15.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.811f)
                lineTo(14.473f, 15.534f)
                close()
                moveTo(10.182f, 7f)
                lineTo(12.75f, 9.568f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(9f)
                curveTo(15.5f, 9.414f, 15.836f, 9.75f, 16.25f, 9.75f)
                curveTo(16.664f, 9.75f, 17f, 9.414f, 17f, 9f)
                verticalLineTo(7.75f)
                curveTo(17f, 7.336f, 16.664f, 7f, 16.25f, 7f)
                horizontalLineTo(10.182f)
                close()
                moveTo(20.5f, 17.318f)
                lineTo(21.999f, 18.818f)
                curveTo(22f, 18.795f, 22f, 18.773f, 22f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
                curveTo(20.836f, 15f, 20.5f, 15.336f, 20.5f, 15.75f)
                verticalLineTo(17.318f)
                close()
                moveTo(5.183f, 2.001f)
                lineTo(6.682f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 3.5f, 9f, 3.164f, 9f, 2.75f)
                curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
                horizontalLineTo(5.25f)
                curveTo(5.227f, 2f, 5.205f, 2f, 5.183f, 2.001f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(4.284f, 20.5f, 3.5f, 19.716f, 3.5f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 15.336f, 3.164f, 15f, 2.75f, 15f)
                curveTo(2.336f, 15f, 2f, 15.336f, 2f, 15.75f)
                verticalLineTo(18.75f)
                curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 22f, 9f, 21.664f, 9f, 21.25f)
                curveTo(9f, 20.836f, 8.664f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(20.5f, 5.25f)
                curveTo(20.5f, 4.284f, 19.716f, 3.5f, 18.75f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 3.5f, 15f, 3.164f, 15f, 2.75f)
                curveTo(15f, 2.336f, 15.336f, 2f, 15.75f, 2f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(22f, 8.664f, 21.664f, 9f, 21.25f, 9f)
                curveTo(20.836f, 9f, 20.5f, 8.664f, 20.5f, 8.25f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _ScanTypeOff!!
    }

@Suppress("ObjectPropertyName")
private var _ScanTypeOff: ImageVector? = null

@Preview
@Composable
private fun ScanTypeOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ScanTypeOff, contentDescription = null)
    }
}
