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

public val FluentIcons.Filled.Location: ImageVector
    get() {
        if (_Location != null) {
            return _Location!!
        }
        _Location = ImageVector.Builder(
            name = "Filled.Location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.157f, 16.882f)
                lineTo(16.97f, 18.056f)
                curveTo(16.095f, 18.915f, 14.96f, 20.019f, 13.564f, 21.368f)
                curveTo(12.692f, 22.212f, 11.308f, 22.212f, 10.436f, 21.368f)
                lineTo(6.945f, 17.972f)
                curveTo(6.506f, 17.541f, 6.139f, 17.178f, 5.843f, 16.882f)
                curveTo(2.443f, 13.482f, 2.443f, 7.969f, 5.843f, 4.568f)
                curveTo(9.244f, 1.168f, 14.757f, 1.168f, 18.157f, 4.568f)
                curveTo(21.558f, 7.969f, 21.558f, 13.482f, 18.157f, 16.882f)
                close()
                moveTo(14.5f, 11f)
                curveTo(14.5f, 9.619f, 13.381f, 8.5f, 12f, 8.5f)
                curveTo(10.619f, 8.5f, 9.5f, 9.619f, 9.5f, 11f)
                curveTo(9.5f, 12.381f, 10.619f, 13.5f, 12f, 13.5f)
                curveTo(13.381f, 13.5f, 14.5f, 12.381f, 14.5f, 11f)
                close()
            }
        }.build()

        return _Location!!
    }

@Suppress("ObjectPropertyName")
private var _Location: ImageVector? = null

@Preview
@Composable
private fun LocationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Location, contentDescription = null)
    }
}
