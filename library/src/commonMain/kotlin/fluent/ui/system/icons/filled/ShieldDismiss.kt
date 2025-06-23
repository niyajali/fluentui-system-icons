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

public val FluentIcons.Filled.ShieldDismiss: ImageVector
    get() {
        if (_ShieldDismiss != null) {
            return _ShieldDismiss!!
        }
        _ShieldDismiss = ImageVector.Builder(
            name = "Filled.ShieldDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 16.001f, 18.042f, 19.676f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                close()
                moveTo(9.281f, 8.222f)
                curveTo(8.988f, 7.929f, 8.514f, 7.929f, 8.222f, 8.222f)
                curveTo(7.956f, 8.488f, 7.931f, 8.904f, 8.149f, 9.197f)
                lineTo(8.222f, 9.281f)
                lineTo(10.945f, 12.004f)
                lineTo(8.222f, 14.729f)
                curveTo(7.929f, 15.021f, 7.929f, 15.495f, 8.222f, 15.788f)
                curveTo(8.514f, 16.081f, 8.988f, 16.081f, 9.281f, 15.788f)
                lineTo(12.004f, 13.064f)
                lineTo(14.729f, 15.788f)
                curveTo(14.995f, 16.054f, 15.411f, 16.078f, 15.704f, 15.861f)
                lineTo(15.788f, 15.788f)
                curveTo(16.054f, 15.522f, 16.078f, 15.106f, 15.861f, 14.813f)
                lineTo(15.788f, 14.729f)
                lineTo(13.064f, 12.004f)
                lineTo(15.788f, 9.281f)
                curveTo(16.081f, 8.988f, 16.081f, 8.514f, 15.788f, 8.222f)
                curveTo(15.495f, 7.929f, 15.021f, 7.929f, 14.729f, 8.222f)
                lineTo(12.004f, 10.945f)
                lineTo(9.281f, 8.222f)
                close()
            }
        }.build()

        return _ShieldDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldDismiss: ImageVector? = null

@Preview
@Composable
private fun ShieldDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldDismiss, contentDescription = null)
    }
}
