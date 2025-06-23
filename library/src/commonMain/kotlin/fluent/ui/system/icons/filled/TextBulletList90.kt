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

public val FluentIcons.Filled.TextBulletList90: ImageVector
    get() {
        if (_TextBulletList90 != null) {
            return _TextBulletList90!!
        }
        _TextBulletList90 = ImageVector.Builder(
            name = "Filled.TextBulletList90",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.499f, 3.499f)
                curveTo(7.499f, 4.328f, 6.828f, 4.999f, 5.999f, 4.999f)
                curveTo(5.171f, 4.999f, 4.5f, 4.328f, 4.5f, 3.499f)
                curveTo(4.5f, 2.671f, 5.171f, 2f, 5.999f, 2f)
                curveTo(6.828f, 2f, 7.499f, 2.671f, 7.499f, 3.499f)
                close()
                moveTo(6.999f, 7.5f)
                lineTo(6.999f, 21.003f)
                curveTo(6.999f, 21.556f, 6.552f, 22.003f, 5.999f, 22.003f)
                curveTo(5.487f, 22.003f, 5.064f, 21.617f, 5.006f, 21.12f)
                lineTo(4.999f, 21.003f)
                lineTo(4.999f, 7.5f)
                curveTo(4.999f, 6.948f, 5.447f, 6.5f, 5.999f, 6.5f)
                curveTo(6.512f, 6.5f, 6.935f, 6.886f, 6.993f, 7.384f)
                lineTo(6.999f, 7.5f)
                close()
                moveTo(13.499f, 3.499f)
                curveTo(13.499f, 4.328f, 12.828f, 4.999f, 11.999f, 4.999f)
                curveTo(11.171f, 4.999f, 10.5f, 4.328f, 10.5f, 3.499f)
                curveTo(10.5f, 2.671f, 11.171f, 2f, 11.999f, 2f)
                curveTo(12.828f, 2f, 13.499f, 2.671f, 13.499f, 3.499f)
                close()
                moveTo(12.999f, 7.5f)
                lineTo(12.999f, 21.003f)
                curveTo(12.999f, 21.556f, 12.552f, 22.003f, 11.999f, 22.003f)
                curveTo(11.487f, 22.003f, 11.064f, 21.617f, 11.006f, 21.12f)
                lineTo(10.999f, 21.003f)
                lineTo(10.999f, 7.5f)
                curveTo(10.999f, 6.948f, 11.447f, 6.5f, 11.999f, 6.5f)
                curveTo(12.512f, 6.5f, 12.935f, 6.886f, 12.993f, 7.384f)
                lineTo(12.999f, 7.5f)
                close()
                moveTo(19.492f, 3.499f)
                curveTo(19.492f, 4.328f, 18.82f, 4.999f, 17.992f, 4.999f)
                curveTo(17.164f, 4.999f, 16.493f, 4.328f, 16.493f, 3.499f)
                curveTo(16.493f, 2.671f, 17.164f, 2f, 17.992f, 2f)
                curveTo(18.82f, 2f, 19.492f, 2.671f, 19.492f, 3.499f)
                close()
                moveTo(18.999f, 7.5f)
                lineTo(18.999f, 21.003f)
                curveTo(18.999f, 21.556f, 18.551f, 22.003f, 17.999f, 22.003f)
                curveTo(17.486f, 22.003f, 17.063f, 21.617f, 17.005f, 21.12f)
                lineTo(16.999f, 21.003f)
                lineTo(16.999f, 7.5f)
                curveTo(16.999f, 6.948f, 17.446f, 6.5f, 17.999f, 6.5f)
                curveTo(18.511f, 6.5f, 18.934f, 6.886f, 18.992f, 7.384f)
                lineTo(18.999f, 7.5f)
                close()
            }
        }.build()

        return _TextBulletList90!!
    }

@Suppress("ObjectPropertyName")
private var _TextBulletList90: ImageVector? = null

@Preview
@Composable
private fun TextBulletList90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextBulletList90, contentDescription = null)
    }
}
