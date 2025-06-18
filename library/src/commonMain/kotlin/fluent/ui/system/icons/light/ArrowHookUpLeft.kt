/**
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
package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.ArrowHookUpLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowHookUpLeft",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.854f, 5.146f)
            curveTo(13.049f, 5.342f, 13.049f, 5.658f, 12.854f, 5.854f)
            lineTo(7.707f, 11f)
            horizontalLineTo(19f)
            curveTo(22.866f, 11f, 26f, 14.134f, 26f, 18f)
            curveTo(26f, 21.866f, 22.866f, 25f, 19f, 25f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 25f, 9f, 24.776f, 9f, 24.5f)
            curveTo(9f, 24.224f, 9.224f, 24f, 9.5f, 24f)
            horizontalLineTo(19f)
            curveTo(22.314f, 24f, 25f, 21.314f, 25f, 18f)
            curveTo(25f, 14.686f, 22.314f, 12f, 19f, 12f)
            horizontalLineTo(7.707f)
            lineTo(12.854f, 17.146f)
            curveTo(13.049f, 17.342f, 13.049f, 17.658f, 12.854f, 17.854f)
            curveTo(12.658f, 18.049f, 12.342f, 18.049f, 12.146f, 17.854f)
            lineTo(6.146f, 11.854f)
            curveTo(6.053f, 11.76f, 6f, 11.633f, 6f, 11.5f)
            curveTo(6f, 11.367f, 6.053f, 11.24f, 6.146f, 11.146f)
            lineTo(12.146f, 5.146f)
            curveTo(12.342f, 4.951f, 12.658f, 4.951f, 12.854f, 5.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookUpLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowHookUpLeft, contentDescription = null)
    }
}
