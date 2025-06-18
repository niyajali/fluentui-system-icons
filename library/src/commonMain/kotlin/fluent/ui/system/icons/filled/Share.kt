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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.Share: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Share",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            curveTo(11f, 4.164f, 10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineTo(6.75f)
            curveTo(5.507f, 4.5f, 4.5f, 5.507f, 4.5f, 6.75f)
            verticalLineTo(17.25f)
            lineTo(4.512f, 17.48f)
            curveTo(4.627f, 18.615f, 5.585f, 19.5f, 6.75f, 19.5f)
            horizontalLineTo(17.25f)
            curveTo(18.493f, 19.5f, 19.5f, 18.493f, 19.5f, 17.25f)
            verticalLineTo(15.25f)
            curveTo(19.5f, 14.836f, 19.836f, 14.5f, 20.25f, 14.5f)
            curveTo(20.664f, 14.5f, 21f, 14.836f, 21f, 15.25f)
            verticalLineTo(17.25f)
            curveTo(21f, 19.321f, 19.321f, 21f, 17.25f, 21f)
            horizontalLineTo(6.75f)
            curveTo(4.744f, 21f, 3.106f, 19.424f, 3.005f, 17.443f)
            lineTo(3f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineTo(10.25f)
            close()
            moveTo(14.936f, 2.068f)
            curveTo(15.203f, 1.946f, 15.516f, 1.99f, 15.738f, 2.181f)
            lineTo(22.738f, 8.181f)
            curveTo(22.899f, 8.318f, 22.994f, 8.517f, 23f, 8.728f)
            curveTo(23.006f, 8.939f, 22.922f, 9.143f, 22.771f, 9.29f)
            lineTo(15.771f, 16.04f)
            curveTo(15.554f, 16.249f, 15.234f, 16.308f, 14.957f, 16.19f)
            curveTo(14.68f, 16.073f, 14.5f, 15.801f, 14.5f, 15.5f)
            verticalLineTo(12.524f)
            curveTo(13.486f, 12.588f, 12.53f, 12.797f, 11.561f, 13.293f)
            curveTo(10.424f, 13.874f, 9.216f, 14.874f, 7.871f, 16.596f)
            lineTo(7.6f, 16.95f)
            curveTo(7.406f, 17.208f, 7.069f, 17.314f, 6.763f, 17.212f)
            curveTo(6.456f, 17.11f, 6.25f, 16.823f, 6.25f, 16.5f)
            curveTo(6.25f, 13.643f, 6.937f, 10.911f, 8.418f, 8.872f)
            curveTo(9.794f, 6.979f, 11.829f, 5.725f, 14.5f, 5.528f)
            verticalLineTo(2.75f)
            lineTo(14.508f, 2.641f)
            curveTo(14.544f, 2.393f, 14.704f, 2.175f, 14.936f, 2.068f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SharePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Share, contentDescription = null)
    }
}
