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

public val FluentIcons.Regular.CheckmarkUnderlineCircle: ImageVector
    get() {
        if (_CheckmarkUnderlineCircle != null) {
            return _CheckmarkUnderlineCircle!!
        }
        _CheckmarkUnderlineCircle = ImageVector.Builder(
            name = "Regular.CheckmarkUnderlineCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.75f, 11.439f)
                lineTo(15.22f, 6.97f)
                curveTo(15.513f, 6.677f, 15.987f, 6.677f, 16.28f, 6.97f)
                curveTo(16.547f, 7.236f, 16.571f, 7.653f, 16.353f, 7.946f)
                lineTo(16.28f, 8.03f)
                lineTo(11.28f, 13.03f)
                curveTo(11.014f, 13.297f, 10.597f, 13.321f, 10.304f, 13.103f)
                lineTo(10.22f, 13.03f)
                lineTo(7.72f, 10.53f)
                curveTo(7.427f, 10.237f, 7.427f, 9.763f, 7.72f, 9.47f)
                curveTo(7.986f, 9.203f, 8.403f, 9.179f, 8.696f, 9.397f)
                lineTo(8.78f, 9.47f)
                lineTo(10.75f, 11.439f)
                close()
                moveTo(8.5f, 15f)
                curveTo(8.086f, 15f, 7.75f, 15.336f, 7.75f, 15.75f)
                curveTo(7.75f, 16.164f, 8.086f, 16.5f, 8.5f, 16.5f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 16.5f, 16f, 16.164f, 16f, 15.75f)
                curveTo(16f, 15.336f, 15.664f, 15f, 15.25f, 15f)
                horizontalLineTo(8.5f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _CheckmarkUnderlineCircle!!
    }

@Suppress("ObjectPropertyName")
private var _CheckmarkUnderlineCircle: ImageVector? = null

@Preview
@Composable
private fun CheckmarkUnderlineCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CheckmarkUnderlineCircle, contentDescription = null)
    }
}
