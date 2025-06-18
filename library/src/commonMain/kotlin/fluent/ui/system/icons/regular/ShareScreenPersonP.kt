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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ShareScreenPersonP: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareScreenPersonP",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(14.5f)
            curveTo(22f, 13.311f, 21.407f, 12.26f, 20.5f, 11.627f)
            verticalLineTo(7.25f)
            curveTo(20.5f, 6.284f, 19.716f, 5.5f, 18.75f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(13.308f)
            curveTo(13.111f, 18.881f, 13f, 19.313f, 13f, 19.772f)
            verticalLineTo(19.875f)
            curveTo(13f, 19.917f, 13.001f, 19.958f, 13.002f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(18.5f, 17f)
            curveTo(19.881f, 17f, 21f, 15.881f, 21f, 14.5f)
            curveTo(21f, 13.119f, 19.881f, 12f, 18.5f, 12f)
            curveTo(17.119f, 12f, 16f, 13.119f, 16f, 14.5f)
            curveTo(16f, 15.881f, 17.119f, 17f, 18.5f, 17f)
            close()
            moveTo(18.5f, 23f)
            curveTo(21.714f, 23f, 23f, 21.431f, 23f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(23f, 18.793f, 22.206f, 18f, 21.227f, 18f)
            horizontalLineTo(15.773f)
            curveTo(14.794f, 18f, 14f, 18.793f, 14f, 19.772f)
            verticalLineTo(19.875f)
            curveTo(14f, 21.437f, 15.286f, 23f, 18.5f, 23f)
            close()
            moveTo(7.75f, 8f)
            curveTo(7.336f, 8f, 7f, 8.336f, 7f, 8.75f)
            verticalLineTo(15.25f)
            curveTo(7f, 15.664f, 7.336f, 16f, 7.75f, 16f)
            curveTo(8.164f, 16f, 8.5f, 15.664f, 8.5f, 15.25f)
            verticalLineTo(13.5f)
            horizontalLineTo(9.75f)
            curveTo(11.269f, 13.5f, 12.5f, 12.269f, 12.5f, 10.75f)
            curveTo(12.5f, 9.231f, 11.269f, 8f, 9.75f, 8f)
            horizontalLineTo(7.75f)
            close()
            moveTo(9.75f, 12f)
            horizontalLineTo(8.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(9.75f)
            curveTo(10.44f, 9.5f, 11f, 10.06f, 11f, 10.75f)
            curveTo(11f, 11.44f, 10.44f, 12f, 9.75f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareScreenPersonPPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShareScreenPersonP, contentDescription = null)
    }
}
