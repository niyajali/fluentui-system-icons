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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Speaker1: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Speaker1",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.704f, 3.443f)
            curveTo(14.895f, 3.668f, 15f, 3.954f, 15f, 4.25f)
            verticalLineTo(19.752f)
            curveTo(15f, 20.442f, 14.44f, 21.002f, 13.75f, 21.002f)
            curveTo(13.454f, 21.002f, 13.168f, 20.897f, 12.942f, 20.706f)
            lineTo(7.975f, 16.5f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16.5f, 2f, 15.493f, 2f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(2f, 8.507f, 3.007f, 7.5f, 4.25f, 7.5f)
            horizontalLineTo(7.975f)
            lineTo(12.943f, 3.296f)
            curveTo(13.469f, 2.85f, 14.258f, 2.916f, 14.704f, 3.443f)
            close()
            moveTo(13.5f, 4.789f)
            lineTo(8.525f, 9f)
            horizontalLineTo(4.25f)
            curveTo(3.836f, 9f, 3.5f, 9.336f, 3.5f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(3.5f, 14.664f, 3.836f, 15f, 4.25f, 15f)
            horizontalLineTo(8.525f)
            lineTo(13.5f, 19.212f)
            verticalLineTo(4.789f)
            close()
            moveTo(17.104f, 8.64f)
            curveTo(17.457f, 8.424f, 17.919f, 8.536f, 18.134f, 8.89f)
            curveTo(18.708f, 9.83f, 18.996f, 10.882f, 18.996f, 12.03f)
            curveTo(18.996f, 13.179f, 18.708f, 14.231f, 18.134f, 15.171f)
            curveTo(17.919f, 15.525f, 17.457f, 15.636f, 17.104f, 15.421f)
            curveTo(16.75f, 15.205f, 16.638f, 14.743f, 16.854f, 14.39f)
            curveTo(17.282f, 13.688f, 17.496f, 12.907f, 17.496f, 12.03f)
            curveTo(17.496f, 11.154f, 17.282f, 10.373f, 16.854f, 9.671f)
            curveTo(16.638f, 9.318f, 16.75f, 8.856f, 17.104f, 8.64f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Speaker1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Speaker1, contentDescription = null)
    }
}
