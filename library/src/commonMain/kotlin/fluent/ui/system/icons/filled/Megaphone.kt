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

public val FluentIcons.Filled.Megaphone: ImageVector
    get() {
        if (_Megaphone != null) {
            return _Megaphone!!
        }
        _Megaphone = ImageVector.Builder(
            name = "Filled.Megaphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.907f, 5.622f)
                curveTo(21.969f, 5.83f, 22f, 6.046f, 22f, 6.263f)
                verticalLineTo(17.739f)
                curveTo(22f, 18.981f, 20.993f, 19.989f, 19.75f, 19.989f)
                curveTo(19.533f, 19.989f, 19.317f, 19.957f, 19.109f, 19.895f)
                lineTo(13.595f, 18.256f)
                curveTo(12.938f, 19.601f, 11.558f, 20.499f, 10f, 20.499f)
                curveTo(7.858f, 20.499f, 6.109f, 18.816f, 6.005f, 16.699f)
                lineTo(6f, 16.499f)
                lineTo(5.999f, 15.999f)
                lineTo(3.609f, 15.288f)
                curveTo(2.654f, 15.004f, 2f, 14.127f, 2f, 13.131f)
                verticalLineTo(10.869f)
                curveTo(2f, 9.874f, 2.655f, 8.996f, 3.609f, 8.713f)
                lineTo(19.109f, 4.107f)
                curveTo(20.3f, 3.753f, 21.553f, 4.431f, 21.907f, 5.622f)
                close()
                moveTo(7.499f, 16.445f)
                lineTo(7.5f, 16.499f)
                curveTo(7.5f, 17.88f, 8.619f, 18.999f, 10f, 18.999f)
                curveTo(10.885f, 18.999f, 11.678f, 18.535f, 12.124f, 17.82f)
                lineTo(7.499f, 16.445f)
                close()
            }
        }.build()

        return _Megaphone!!
    }

@Suppress("ObjectPropertyName")
private var _Megaphone: ImageVector? = null

@Preview
@Composable
private fun MegaphonePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Megaphone, contentDescription = null)
    }
}
