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

public val FluentIcons.Regular.NumberCircle0: ImageVector
    get() {
        if (_NumberCircle0 != null) {
            return _NumberCircle0!!
        }
        _NumberCircle0 = ImageVector.Builder(
            name = "Regular.NumberCircle0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.5f, 12f)
                curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
                curveTo(7.306f, 20.5f, 3.5f, 16.694f, 3.5f, 12f)
                curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
                curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
                close()
                moveTo(12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                close()
                moveTo(9.75f, 12f)
                curveTo(9.75f, 10.737f, 9.934f, 9.698f, 10.315f, 9f)
                curveTo(10.664f, 8.361f, 11.173f, 8f, 12f, 8f)
                curveTo(12.827f, 8f, 13.336f, 8.361f, 13.685f, 9f)
                curveTo(14.066f, 9.698f, 14.25f, 10.737f, 14.25f, 12f)
                curveTo(14.25f, 13.263f, 14.066f, 14.302f, 13.685f, 15f)
                curveTo(13.336f, 15.639f, 12.827f, 16f, 12f, 16f)
                curveTo(11.173f, 16f, 10.664f, 15.639f, 10.315f, 15f)
                curveTo(9.934f, 14.302f, 9.75f, 13.263f, 9.75f, 12f)
                close()
                moveTo(12f, 6.5f)
                curveTo(10.577f, 6.5f, 9.586f, 7.203f, 8.998f, 8.282f)
                curveTo(8.441f, 9.304f, 8.25f, 10.64f, 8.25f, 12f)
                curveTo(8.25f, 13.36f, 8.441f, 14.696f, 8.998f, 15.718f)
                curveTo(9.586f, 16.797f, 10.577f, 17.5f, 12f, 17.5f)
                curveTo(13.423f, 17.5f, 14.414f, 16.797f, 15.002f, 15.718f)
                curveTo(15.559f, 14.696f, 15.75f, 13.36f, 15.75f, 12f)
                curveTo(15.75f, 10.64f, 15.559f, 9.304f, 15.002f, 8.282f)
                curveTo(14.414f, 7.203f, 13.423f, 6.5f, 12f, 6.5f)
                close()
            }
        }.build()

        return _NumberCircle0!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircle0: ImageVector? = null

@Preview
@Composable
private fun NumberCircle0Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NumberCircle0, contentDescription = null)
    }
}
