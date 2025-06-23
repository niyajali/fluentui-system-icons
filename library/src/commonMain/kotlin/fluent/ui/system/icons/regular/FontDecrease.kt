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

public val FluentIcons.Regular.FontDecrease: ImageVector
    get() {
        if (_FontDecrease != null) {
            return _FontDecrease!!
        }
        _FontDecrease = ImageVector.Builder(
            name = "Regular.FontDecrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.255f, 2.195f)
                curveTo(15.948f, 1.916f, 15.474f, 1.939f, 15.195f, 2.246f)
                curveTo(14.917f, 2.552f, 14.939f, 3.026f, 15.246f, 3.305f)
                lineTo(17.996f, 5.805f)
                curveTo(18.282f, 6.065f, 18.719f, 6.065f, 19.004f, 5.805f)
                lineTo(21.754f, 3.305f)
                curveTo(22.061f, 3.026f, 22.084f, 2.552f, 21.805f, 2.246f)
                curveTo(21.526f, 1.939f, 21.052f, 1.916f, 20.746f, 2.195f)
                lineTo(18.5f, 4.236f)
                lineTo(16.255f, 2.195f)
                close()
                moveTo(12f, 4f)
                curveTo(12.308f, 4f, 12.584f, 4.188f, 12.697f, 4.474f)
                lineTo(18.447f, 18.973f)
                curveTo(18.6f, 19.358f, 18.412f, 19.794f, 18.027f, 19.947f)
                curveTo(17.641f, 20.1f, 17.205f, 19.911f, 17.053f, 19.526f)
                lineTo(15.258f, 15f)
                horizontalLineTo(8.742f)
                lineTo(6.947f, 19.526f)
                curveTo(6.795f, 19.911f, 6.359f, 20.1f, 5.974f, 19.947f)
                curveTo(5.589f, 19.794f, 5.4f, 19.358f, 5.553f, 18.973f)
                lineTo(11.303f, 4.474f)
                curveTo(11.416f, 4.188f, 11.693f, 4f, 12f, 4f)
                close()
                moveTo(12f, 6.785f)
                lineTo(9.337f, 13.5f)
                horizontalLineTo(14.663f)
                lineTo(12f, 6.785f)
                close()
            }
        }.build()

        return _FontDecrease!!
    }

@Suppress("ObjectPropertyName")
private var _FontDecrease: ImageVector? = null

@Preview
@Composable
private fun FontDecreasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FontDecrease, contentDescription = null)
    }
}
