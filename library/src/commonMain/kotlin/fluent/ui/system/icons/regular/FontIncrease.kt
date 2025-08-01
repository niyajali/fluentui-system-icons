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

public val FluentIcons.Regular.FontIncrease: ImageVector
    get() {
        if (_FontIncrease != null) {
            return _FontIncrease!!
        }
        _FontIncrease = ImageVector.Builder(
            name = "Regular.FontIncrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.195f, 5.754f)
                curveTo(15.474f, 6.061f, 15.948f, 6.084f, 16.255f, 5.805f)
                lineTo(18.5f, 3.764f)
                lineTo(20.746f, 5.805f)
                curveTo(21.052f, 6.084f, 21.526f, 6.061f, 21.805f, 5.754f)
                curveTo(22.084f, 5.448f, 22.061f, 4.974f, 21.754f, 4.695f)
                lineTo(19.004f, 2.195f)
                curveTo(18.719f, 1.935f, 18.282f, 1.935f, 17.996f, 2.195f)
                lineTo(15.246f, 4.695f)
                curveTo(14.939f, 4.974f, 14.917f, 5.448f, 15.195f, 5.754f)
                close()
                moveTo(12f, 4f)
                curveTo(12.308f, 4f, 12.584f, 4.188f, 12.697f, 4.473f)
                lineTo(18.447f, 18.973f)
                curveTo(18.6f, 19.358f, 18.412f, 19.794f, 18.027f, 19.947f)
                curveTo(17.641f, 20.1f, 17.205f, 19.911f, 17.053f, 19.526f)
                lineTo(15.258f, 15f)
                horizontalLineTo(8.742f)
                lineTo(6.947f, 19.526f)
                curveTo(6.795f, 19.911f, 6.359f, 20.1f, 5.974f, 19.947f)
                curveTo(5.589f, 19.794f, 5.4f, 19.358f, 5.553f, 18.973f)
                lineTo(11.303f, 4.473f)
                curveTo(11.416f, 4.188f, 11.693f, 4f, 12f, 4f)
                close()
                moveTo(9.337f, 13.5f)
                horizontalLineTo(14.663f)
                lineTo(12f, 6.785f)
                lineTo(9.337f, 13.5f)
                close()
            }
        }.build()

        return _FontIncrease!!
    }

@Suppress("ObjectPropertyName")
private var _FontIncrease: ImageVector? = null

@Preview
@Composable
private fun FontIncreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FontIncrease, contentDescription = null)
    }
}
