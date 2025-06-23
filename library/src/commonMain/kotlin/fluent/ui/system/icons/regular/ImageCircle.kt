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

public val FluentIcons.Regular.ImageCircle: ImageVector
    get() {
        if (_ImageCircle != null) {
            return _ImageCircle!!
        }
        _ImageCircle = ImageVector.Builder(
            name = "Regular.ImageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 14.081f, 4.248f, 15.987f, 5.489f, 17.465f)
                lineTo(10.424f, 12.622f)
                curveTo(11.299f, 11.763f, 12.701f, 11.763f, 13.576f, 12.622f)
                lineTo(18.511f, 17.465f)
                curveTo(19.752f, 15.987f, 20.5f, 14.081f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
                moveTo(17.449f, 18.524f)
                lineTo(12.525f, 13.693f)
                curveTo(12.234f, 13.406f, 11.766f, 13.406f, 11.475f, 13.693f)
                lineTo(6.551f, 18.524f)
                curveTo(8.026f, 19.758f, 9.927f, 20.5f, 12f, 20.5f)
                curveTo(14.073f, 20.5f, 15.974f, 19.758f, 17.449f, 18.524f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(15.25f, 9.5f)
                curveTo(14.836f, 9.5f, 14.5f, 9.164f, 14.5f, 8.75f)
                curveTo(14.5f, 8.336f, 14.836f, 8f, 15.25f, 8f)
                curveTo(15.664f, 8f, 16f, 8.336f, 16f, 8.75f)
                curveTo(16f, 9.164f, 15.664f, 9.5f, 15.25f, 9.5f)
                close()
                moveTo(15.25f, 11f)
                curveTo(16.493f, 11f, 17.5f, 9.993f, 17.5f, 8.75f)
                curveTo(17.5f, 7.507f, 16.493f, 6.5f, 15.25f, 6.5f)
                curveTo(14.007f, 6.5f, 13f, 7.507f, 13f, 8.75f)
                curveTo(13f, 9.993f, 14.007f, 11f, 15.25f, 11f)
                close()
            }
        }.build()

        return _ImageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCircle: ImageVector? = null

@Preview
@Composable
private fun ImageCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageCircle, contentDescription = null)
    }
}
