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

public val FluentIcons.Filled.ChatArrowBackDown: ImageVector
    get() {
        if (_ChatArrowBackDown != null) {
            return _ChatArrowBackDown!!
        }
        _ChatArrowBackDown = ImageVector.Builder(
            name = "Filled.ChatArrowBackDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 13.643f, 2.397f, 15.229f, 3.145f, 16.65f)
                lineTo(2.029f, 20.939f)
                curveTo(1.992f, 21.079f, 1.992f, 21.227f, 2.029f, 21.367f)
                curveTo(2.147f, 21.821f, 2.611f, 22.094f, 3.065f, 21.975f)
                lineTo(7.356f, 20.858f)
                curveTo(8.775f, 21.604f, 10.36f, 22f, 12f, 22f)
                curveTo(12.263f, 22f, 12.523f, 21.99f, 12.781f, 21.97f)
                curveTo(11.677f, 20.805f, 11f, 19.232f, 11f, 17.5f)
                curveTo(11f, 13.91f, 13.91f, 11f, 17.5f, 11f)
                curveTo(19.232f, 11f, 20.805f, 11.677f, 21.97f, 12.781f)
                curveTo(21.99f, 12.523f, 22f, 12.263f, 22f, 12f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(16.354f, 19.646f)
                curveTo(16.549f, 19.842f, 16.549f, 20.158f, 16.354f, 20.354f)
                curveTo(16.158f, 20.549f, 15.842f, 20.549f, 15.646f, 20.354f)
                lineTo(14.146f, 18.854f)
                curveTo(13.951f, 18.658f, 13.951f, 18.342f, 14.146f, 18.146f)
                lineTo(15.646f, 16.646f)
                curveTo(15.842f, 16.451f, 16.158f, 16.451f, 16.354f, 16.646f)
                curveTo(16.549f, 16.842f, 16.549f, 17.158f, 16.354f, 17.354f)
                lineTo(15.707f, 18f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 18f, 20f, 16.993f, 20f, 15.75f)
                verticalLineTo(15.5f)
                curveTo(20f, 15.224f, 20.224f, 15f, 20.5f, 15f)
                curveTo(20.776f, 15f, 21f, 15.224f, 21f, 15.5f)
                verticalLineTo(15.75f)
                curveTo(21f, 17.545f, 19.545f, 19f, 17.75f, 19f)
                horizontalLineTo(15.707f)
                lineTo(16.354f, 19.646f)
                close()
            }
        }.build()

        return _ChatArrowBackDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChatArrowBackDown: ImageVector? = null

@Preview
@Composable
private fun ChatArrowBackDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ChatArrowBackDown, contentDescription = null)
    }
}
