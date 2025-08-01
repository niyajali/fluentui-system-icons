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

public val FluentIcons.Filled.Comma: ImageVector
    get() {
        if (_Comma != null) {
            return _Comma!!
        }
        _Comma = ImageVector.Builder(
            name = "Filled.Comma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.2f, 12.342f)
                curveTo(13.568f, 12.758f, 12.813f, 13f, 12f, 13f)
                curveTo(9.791f, 13f, 8f, 11.209f, 8f, 9f)
                curveTo(8f, 6.791f, 9.791f, 5f, 12f, 5f)
                curveTo(14.029f, 5f, 15.705f, 6.511f, 15.965f, 8.469f)
                curveTo(16.33f, 10.261f, 16.472f, 12.416f, 15.758f, 14.366f)
                curveTo(14.992f, 16.456f, 13.294f, 18.171f, 10.253f, 18.967f)
                curveTo(9.719f, 19.107f, 9.172f, 18.788f, 9.033f, 18.253f)
                curveTo(8.893f, 17.719f, 9.212f, 17.173f, 9.747f, 17.033f)
                curveTo(12.206f, 16.389f, 13.358f, 15.104f, 13.88f, 13.679f)
                curveTo(14.035f, 13.254f, 14.139f, 12.805f, 14.2f, 12.342f)
                close()
            }
        }.build()

        return _Comma!!
    }

@Suppress("ObjectPropertyName")
private var _Comma: ImageVector? = null

@Preview
@Composable
private fun CommaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Comma, contentDescription = null)
    }
}
