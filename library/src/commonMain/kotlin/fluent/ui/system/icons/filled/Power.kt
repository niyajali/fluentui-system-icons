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

public val FluentIcons.Filled.Power: ImageVector
    get() {
        if (_Power != null) {
            return _Power!!
        }
        _Power = ImageVector.Builder(
            name = "Filled.Power",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.205f, 4.843f)
                curveTo(8.706f, 4.61f, 9.301f, 4.827f, 9.534f, 5.328f)
                curveTo(9.767f, 5.828f, 9.55f, 6.423f, 9.049f, 6.656f)
                curveTo(6.599f, 7.796f, 5f, 10.255f, 5f, 13.003f)
                curveTo(5f, 16.867f, 8.134f, 20f, 12f, 20f)
                curveTo(15.866f, 20f, 19f, 16.867f, 19f, 13.003f)
                curveTo(19f, 10.26f, 17.407f, 7.806f, 14.965f, 6.663f)
                curveTo(14.465f, 6.429f, 14.25f, 5.834f, 14.484f, 5.333f)
                curveTo(14.718f, 4.833f, 15.313f, 4.618f, 15.813f, 4.852f)
                curveTo(18.952f, 6.321f, 21f, 9.477f, 21f, 13.003f)
                curveTo(21f, 17.972f, 16.971f, 22f, 12f, 22f)
                curveTo(7.03f, 22f, 3f, 17.972f, 3f, 13.003f)
                curveTo(3f, 9.47f, 5.057f, 6.308f, 8.205f, 4.843f)
                close()
                moveTo(12f, 1.999f)
                curveTo(12.513f, 1.999f, 12.936f, 2.385f, 12.993f, 2.882f)
                lineTo(13f, 2.999f)
                verticalLineTo(10f)
                curveTo(13f, 10.553f, 12.552f, 11f, 12f, 11f)
                curveTo(11.487f, 11f, 11.064f, 10.614f, 11.007f, 10.117f)
                lineTo(11f, 10f)
                verticalLineTo(2.999f)
                curveTo(11f, 2.447f, 11.448f, 1.999f, 12f, 1.999f)
                close()
            }
        }.build()

        return _Power!!
    }

@Suppress("ObjectPropertyName")
private var _Power: ImageVector? = null

@Preview
@Composable
private fun PowerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Power, contentDescription = null)
    }
}
