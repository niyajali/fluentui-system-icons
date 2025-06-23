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

public val FluentIcons.Filled.GasPump: ImageVector
    get() {
        if (_GasPump != null) {
            return _GasPump!!
        }
        _GasPump = ImageVector.Builder(
            name = "Filled.GasPump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 3f)
                curveTo(5.231f, 3f, 4f, 4.231f, 4f, 5.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 20.5f, 3f, 20.836f, 3f, 21.25f)
                curveTo(3f, 21.664f, 3.336f, 22f, 3.75f, 22f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 22f, 18f, 21.664f, 18f, 21.25f)
                curveTo(18f, 20.836f, 17.664f, 20.5f, 17.25f, 20.5f)
                horizontalLineTo(17f)
                verticalLineTo(18.697f)
                curveTo(17.376f, 18.891f, 17.803f, 19f, 18.255f, 19f)
                curveTo(19.771f, 19f, 21f, 17.771f, 21f, 16.255f)
                verticalLineTo(10.417f)
                curveTo(21f, 9.822f, 20.807f, 9.243f, 20.45f, 8.767f)
                lineTo(19.35f, 7.3f)
                curveTo(19.101f, 6.969f, 18.631f, 6.901f, 18.3f, 7.15f)
                curveTo(17.969f, 7.399f, 17.901f, 7.869f, 18.15f, 8.2f)
                lineTo(19.25f, 9.667f)
                curveTo(19.412f, 9.883f, 19.5f, 10.146f, 19.5f, 10.417f)
                verticalLineTo(16.255f)
                curveTo(19.5f, 16.943f, 18.943f, 17.5f, 18.255f, 17.5f)
                curveTo(17.567f, 17.5f, 17.01f, 16.943f, 17.01f, 16.255f)
                verticalLineTo(14.5f)
                curveTo(17.01f, 14.459f, 17.007f, 14.418f, 17f, 14.379f)
                verticalLineTo(5.75f)
                curveTo(17f, 4.231f, 15.769f, 3f, 14.25f, 3f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7f, 6.75f)
                curveTo(7f, 6.336f, 7.336f, 6f, 7.75f, 6f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 6f, 14f, 6.336f, 14f, 6.75f)
                verticalLineTo(10.25f)
                curveTo(14f, 10.664f, 13.664f, 11f, 13.25f, 11f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 11f, 7f, 10.664f, 7f, 10.25f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _GasPump!!
    }

@Suppress("ObjectPropertyName")
private var _GasPump: ImageVector? = null

@Preview
@Composable
private fun GasPumpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GasPump, contentDescription = null)
    }
}
