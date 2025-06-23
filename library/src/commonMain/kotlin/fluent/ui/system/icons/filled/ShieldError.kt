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

public val FluentIcons.Filled.ShieldError: ImageVector
    get() {
        if (_ShieldError != null) {
            return _ShieldError!!
        }
        _ShieldError = ImageVector.Builder(
            name = "Filled.ShieldError",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.25f, 5f)
                curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
                curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
                curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
                curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
                verticalLineTo(11f)
                curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
                curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
                curveTo(18.042f, 19.676f, 21f, 16.001f, 21f, 11f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
                close()
                moveTo(11.257f, 7.63f)
                curveTo(11.307f, 7.264f, 11.62f, 6.982f, 12f, 6.982f)
                curveTo(12.38f, 6.982f, 12.693f, 7.264f, 12.743f, 7.63f)
                lineTo(12.75f, 7.732f)
                verticalLineTo(14.232f)
                lineTo(12.743f, 14.334f)
                curveTo(12.693f, 14.7f, 12.38f, 14.982f, 12f, 14.982f)
                curveTo(11.62f, 14.982f, 11.307f, 14.7f, 11.257f, 14.334f)
                lineTo(11.25f, 14.232f)
                verticalLineTo(7.732f)
                lineTo(11.257f, 7.63f)
                close()
                moveTo(12f, 18f)
                curveTo(11.448f, 18f, 11f, 17.552f, 11f, 17f)
                curveTo(11f, 16.448f, 11.448f, 16f, 12f, 16f)
                curveTo(12.552f, 16f, 13f, 16.448f, 13f, 17f)
                curveTo(13f, 17.552f, 12.552f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _ShieldError!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldError: ImageVector? = null

@Preview
@Composable
private fun ShieldErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldError, contentDescription = null)
    }
}
