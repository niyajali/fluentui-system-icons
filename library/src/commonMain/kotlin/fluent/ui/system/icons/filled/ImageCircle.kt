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

public val FluentIcons.Filled.ImageCircle: ImageVector
    get() {
        if (_ImageCircle != null) {
            return _ImageCircle!!
        }
        _ImageCircle = ImageVector.Builder(
            name = "Filled.ImageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.564f, 18.542f)
                curveTo(21.082f, 16.788f, 22f, 14.501f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 14.501f, 2.918f, 16.788f, 4.436f, 18.542f)
                lineTo(10.419f, 12.633f)
                curveTo(11.295f, 11.768f, 12.705f, 11.768f, 13.581f, 12.633f)
                lineTo(19.564f, 18.542f)
                close()
                moveTo(18.5f, 19.599f)
                lineTo(12.527f, 13.701f)
                curveTo(12.235f, 13.412f, 11.765f, 13.412f, 11.473f, 13.701f)
                lineTo(5.5f, 19.599f)
                curveTo(7.248f, 21.096f, 9.518f, 22f, 12f, 22f)
                curveTo(14.482f, 22f, 16.752f, 21.096f, 18.5f, 19.599f)
                close()
                moveTo(17.5f, 8.5f)
                curveTo(17.5f, 9.605f, 16.605f, 10.5f, 15.5f, 10.5f)
                curveTo(14.395f, 10.5f, 13.5f, 9.605f, 13.5f, 8.5f)
                curveTo(13.5f, 7.395f, 14.395f, 6.5f, 15.5f, 6.5f)
                curveTo(16.605f, 6.5f, 17.5f, 7.395f, 17.5f, 8.5f)
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
        Image(imageVector = FluentIcons.Filled.ImageCircle, contentDescription = null)
    }
}
