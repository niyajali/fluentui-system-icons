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

public val FluentIcons.Filled.Timer10: ImageVector
    get() {
        if (_Timer10 != null) {
            return _Timer10!!
        }
        _Timer10 = ImageVector.Builder(
            name = "Filled.Timer10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 5f)
                curveTo(16.199f, 5f, 19.686f, 8.044f, 20.376f, 12.046f)
                curveTo(20.172f, 12.016f, 19.963f, 12f, 19.75f, 12f)
                curveTo(18.127f, 12f, 16.716f, 12.91f, 16f, 14.248f)
                verticalLineTo(13.75f)
                curveTo(16f, 13.188f, 15.73f, 12.659f, 15.273f, 12.33f)
                curveTo(14.817f, 12.001f, 14.23f, 11.912f, 13.697f, 12.09f)
                lineTo(12.75f, 12.405f)
                verticalLineTo(8.75f)
                lineTo(12.743f, 8.648f)
                curveTo(12.693f, 8.282f, 12.38f, 8f, 12f, 8f)
                curveTo(11.62f, 8f, 11.307f, 8.282f, 11.257f, 8.648f)
                lineTo(11.25f, 8.75f)
                verticalLineTo(13.25f)
                lineTo(11.256f, 13.339f)
                curveTo(10.997f, 13.763f, 10.92f, 14.295f, 11.09f, 14.803f)
                curveTo(11.306f, 15.453f, 11.866f, 15.89f, 12.5f, 15.982f)
                verticalLineTo(21.986f)
                curveTo(12.335f, 21.995f, 12.168f, 22f, 12f, 22f)
                curveTo(7.306f, 22f, 3.5f, 18.194f, 3.5f, 13.5f)
                curveTo(3.5f, 8.806f, 7.306f, 5f, 12f, 5f)
                close()
                moveTo(19.17f, 5.123f)
                lineTo(19.252f, 5.184f)
                lineTo(20.401f, 6.184f)
                curveTo(20.713f, 6.456f, 20.746f, 6.93f, 20.474f, 7.242f)
                curveTo(20.225f, 7.529f, 19.806f, 7.58f, 19.497f, 7.377f)
                lineTo(19.416f, 7.316f)
                lineTo(18.267f, 6.316f)
                curveTo(17.955f, 6.044f, 17.922f, 5.57f, 18.194f, 5.258f)
                curveTo(18.443f, 4.971f, 18.862f, 4.92f, 19.17f, 5.123f)
                close()
                moveTo(14.25f, 2.5f)
                curveTo(14.664f, 2.5f, 15f, 2.836f, 15f, 3.25f)
                curveTo(15f, 3.63f, 14.718f, 3.943f, 14.352f, 3.993f)
                lineTo(14.25f, 4f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 4f, 9f, 3.664f, 9f, 3.25f)
                curveTo(9f, 2.87f, 9.282f, 2.557f, 9.648f, 2.507f)
                lineTo(9.75f, 2.5f)
                horizontalLineTo(14.25f)
                close()
                moveTo(14.689f, 13.142f)
                curveTo(14.884f, 13.283f, 15f, 13.509f, 15f, 13.75f)
                verticalLineTo(22.25f)
                curveTo(15f, 22.664f, 14.664f, 23f, 14.25f, 23f)
                curveTo(13.836f, 23f, 13.5f, 22.664f, 13.5f, 22.25f)
                verticalLineTo(14.791f)
                lineTo(12.987f, 14.962f)
                curveTo(12.594f, 15.092f, 12.17f, 14.88f, 12.038f, 14.487f)
                curveTo(11.908f, 14.094f, 12.12f, 13.67f, 12.513f, 13.538f)
                lineTo(14.013f, 13.038f)
                curveTo(14.241f, 12.962f, 14.493f, 13.001f, 14.689f, 13.142f)
                close()
                moveTo(16.5f, 16.25f)
                curveTo(16.5f, 14.455f, 17.955f, 13f, 19.75f, 13f)
                curveTo(21.545f, 13f, 23f, 14.455f, 23f, 16.25f)
                verticalLineTo(19.75f)
                curveTo(23f, 21.545f, 21.545f, 23f, 19.75f, 23f)
                curveTo(17.955f, 23f, 16.5f, 21.545f, 16.5f, 19.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(19.75f, 14.5f)
                curveTo(18.784f, 14.5f, 18f, 15.283f, 18f, 16.25f)
                verticalLineTo(19.75f)
                curveTo(18f, 20.716f, 18.784f, 21.5f, 19.75f, 21.5f)
                curveTo(20.716f, 21.5f, 21.5f, 20.716f, 21.5f, 19.75f)
                verticalLineTo(16.25f)
                curveTo(21.5f, 15.283f, 20.716f, 14.5f, 19.75f, 14.5f)
                close()
            }
        }.build()

        return _Timer10!!
    }

@Suppress("ObjectPropertyName")
private var _Timer10: ImageVector? = null

@Preview
@Composable
private fun Timer10Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Timer10, contentDescription = null)
    }
}
