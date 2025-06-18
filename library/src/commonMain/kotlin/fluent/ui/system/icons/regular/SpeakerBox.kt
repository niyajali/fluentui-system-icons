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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.SpeakerBox: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerBox",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5.25f)
            curveTo(4f, 3.455f, 5.455f, 2f, 7.25f, 2f)
            horizontalLineTo(16.75f)
            curveTo(18.545f, 2f, 20f, 3.455f, 20f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(20f, 20.545f, 18.545f, 22f, 16.75f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 22f, 4f, 20.545f, 4f, 18.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(7.25f, 3.5f)
            curveTo(6.284f, 3.5f, 5.5f, 4.284f, 5.5f, 5.25f)
            verticalLineTo(18.75f)
            curveTo(5.5f, 19.716f, 6.284f, 20.5f, 7.25f, 20.5f)
            horizontalLineTo(16.75f)
            curveTo(17.716f, 20.5f, 18.5f, 19.716f, 18.5f, 18.75f)
            verticalLineTo(5.25f)
            curveTo(18.5f, 4.284f, 17.716f, 3.5f, 16.75f, 3.5f)
            horizontalLineTo(7.25f)
            close()
            moveTo(12f, 12.5f)
            curveTo(10.895f, 12.5f, 10f, 13.395f, 10f, 14.5f)
            curveTo(10f, 15.605f, 10.895f, 16.5f, 12f, 16.5f)
            curveTo(13.105f, 16.5f, 14f, 15.605f, 14f, 14.5f)
            curveTo(14f, 13.395f, 13.105f, 12.5f, 12f, 12.5f)
            close()
            moveTo(8.5f, 14.5f)
            curveTo(8.5f, 12.567f, 10.067f, 11f, 12f, 11f)
            curveTo(13.933f, 11f, 15.5f, 12.567f, 15.5f, 14.5f)
            curveTo(15.5f, 16.433f, 13.933f, 18f, 12f, 18f)
            curveTo(10.067f, 18f, 8.5f, 16.433f, 8.5f, 14.5f)
            close()
            moveTo(12f, 9f)
            curveTo(12.828f, 9f, 13.5f, 8.328f, 13.5f, 7.5f)
            curveTo(13.5f, 6.672f, 12.828f, 6f, 12f, 6f)
            curveTo(11.172f, 6f, 10.5f, 6.672f, 10.5f, 7.5f)
            curveTo(10.5f, 8.328f, 11.172f, 9f, 12f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpeakerBoxPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SpeakerBox, contentDescription = null)
    }
}
