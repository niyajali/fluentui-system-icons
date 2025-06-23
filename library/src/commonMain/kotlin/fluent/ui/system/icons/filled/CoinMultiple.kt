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

public val FluentIcons.Filled.CoinMultiple: ImageVector
    get() {
        if (_CoinMultiple != null) {
            return _CoinMultiple!!
        }
        _CoinMultiple = ImageVector.Builder(
            name = "Filled.CoinMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 7f)
                curveTo(19f, 9.761f, 15.866f, 12f, 12f, 12f)
                curveTo(8.134f, 12f, 5f, 9.761f, 5f, 7f)
                curveTo(5f, 4.239f, 8.134f, 2f, 12f, 2f)
                curveTo(15.866f, 2f, 19f, 4.239f, 19f, 7f)
                close()
                moveTo(18.62f, 10.37f)
                curveTo(17.18f, 11.958f, 14.752f, 13f, 12f, 13f)
                curveTo(9.248f, 13f, 6.82f, 11.958f, 5.38f, 10.37f)
                curveTo(5.134f, 10.881f, 5f, 11.429f, 5f, 12f)
                curveTo(5f, 14.761f, 8.134f, 17f, 12f, 17f)
                curveTo(15.866f, 17f, 19f, 14.761f, 19f, 12f)
                curveTo(19f, 11.429f, 18.866f, 10.881f, 18.62f, 10.37f)
                close()
                moveTo(18.62f, 15.37f)
                curveTo(17.18f, 16.958f, 14.752f, 18f, 12f, 18f)
                curveTo(9.248f, 18f, 6.82f, 16.958f, 5.38f, 15.37f)
                curveTo(5.134f, 15.881f, 5f, 16.429f, 5f, 17f)
                curveTo(5f, 19.761f, 8.134f, 22f, 12f, 22f)
                curveTo(15.866f, 22f, 19f, 19.761f, 19f, 17f)
                curveTo(19f, 16.429f, 18.866f, 15.881f, 18.62f, 15.37f)
                close()
            }
        }.build()

        return _CoinMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CoinMultiple: ImageVector? = null

@Preview
@Composable
private fun CoinMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CoinMultiple, contentDescription = null)
    }
}
