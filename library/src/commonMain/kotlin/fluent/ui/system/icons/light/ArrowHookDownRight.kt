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

public val FluentUi.Light.ArrowHookDownRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowHookDownRight",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.146f, 26.854f)
            curveTo(18.951f, 26.658f, 18.951f, 26.342f, 19.146f, 26.146f)
            lineTo(24.293f, 21f)
            horizontalLineTo(13f)
            curveTo(9.134f, 21f, 6f, 17.866f, 6f, 14f)
            curveTo(6f, 10.134f, 9.134f, 7f, 13f, 7f)
            horizontalLineTo(22.5f)
            curveTo(22.776f, 7f, 23f, 7.224f, 23f, 7.5f)
            curveTo(23f, 7.776f, 22.776f, 8f, 22.5f, 8f)
            horizontalLineTo(13f)
            curveTo(9.686f, 8f, 7f, 10.686f, 7f, 14f)
            curveTo(7f, 17.314f, 9.686f, 20f, 13f, 20f)
            horizontalLineTo(24.293f)
            lineTo(19.146f, 14.854f)
            curveTo(18.951f, 14.658f, 18.951f, 14.342f, 19.146f, 14.146f)
            curveTo(19.342f, 13.951f, 19.658f, 13.951f, 19.854f, 14.146f)
            lineTo(25.854f, 20.146f)
            curveTo(25.947f, 20.24f, 26f, 20.367f, 26f, 20.5f)
            curveTo(26f, 20.633f, 25.947f, 20.76f, 25.854f, 20.854f)
            lineTo(19.854f, 26.854f)
            curveTo(19.658f, 27.049f, 19.342f, 27.049f, 19.146f, 26.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowHookDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.ArrowHookDownRight, contentDescription = null)
    }
}
