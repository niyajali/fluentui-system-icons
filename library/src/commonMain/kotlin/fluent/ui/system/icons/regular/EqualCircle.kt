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

public val FluentIcons.Regular.EqualCircle: ImageVector
    get() {
        if (_EqualCircle != null) {
            return _EqualCircle!!
        }
        _EqualCircle = ImageVector.Builder(
            name = "Regular.EqualCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.258f, 10.5f)
                curveTo(16.672f, 10.5f, 17.008f, 10.164f, 17.008f, 9.75f)
                curveTo(17.008f, 9.336f, 16.672f, 9f, 16.258f, 9f)
                lineTo(7.77f, 9f)
                curveTo(7.356f, 9f, 7.02f, 9.336f, 7.02f, 9.75f)
                curveTo(7.02f, 10.164f, 7.356f, 10.5f, 7.77f, 10.5f)
                horizontalLineTo(16.258f)
                close()
                moveTo(16.258f, 15f)
                curveTo(16.672f, 15f, 17.008f, 14.664f, 17.008f, 14.25f)
                curveTo(17.008f, 13.836f, 16.672f, 13.5f, 16.258f, 13.5f)
                horizontalLineTo(7.77f)
                curveTo(7.356f, 13.5f, 7.02f, 13.836f, 7.02f, 14.25f)
                curveTo(7.02f, 14.664f, 7.356f, 15f, 7.77f, 15f)
                horizontalLineTo(16.258f)
                close()
                moveTo(22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                close()
                moveTo(12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _EqualCircle!!
    }

@Suppress("ObjectPropertyName")
private var _EqualCircle: ImageVector? = null

@Preview
@Composable
private fun EqualCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.EqualCircle, contentDescription = null)
    }
}
