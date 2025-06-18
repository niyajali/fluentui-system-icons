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

public val FluentIcons.Filled.CardUiPortraitFlip: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CardUiPortraitFlip",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.75f)
            curveTo(4f, 3.231f, 5.231f, 2f, 6.75f, 2f)
            horizontalLineTo(17.25f)
            curveTo(18.769f, 2f, 20f, 3.231f, 20f, 4.75f)
            verticalLineTo(10f)
            horizontalLineTo(19.25f)
            curveTo(18.284f, 10f, 17.5f, 10.783f, 17.5f, 11.75f)
            curveTo(17.5f, 12.28f, 17.736f, 12.755f, 18.108f, 13.076f)
            curveTo(16.739f, 13.83f, 14.755f, 14.5f, 12f, 14.5f)
            curveTo(9.246f, 14.5f, 7.262f, 13.83f, 5.892f, 13.076f)
            curveTo(6.264f, 12.755f, 6.5f, 12.28f, 6.5f, 11.75f)
            curveTo(6.5f, 10.783f, 5.716f, 10f, 4.75f, 10f)
            horizontalLineTo(4f)
            verticalLineTo(4.75f)
            close()
            moveTo(12f, 18f)
            curveTo(15.501f, 18f, 18.124f, 17.103f, 20f, 16.028f)
            verticalLineTo(19.25f)
            curveTo(20f, 20.769f, 18.769f, 22f, 17.25f, 22f)
            horizontalLineTo(6.75f)
            curveTo(5.231f, 22f, 4f, 20.769f, 4f, 19.25f)
            verticalLineTo(16.028f)
            curveTo(5.876f, 17.103f, 8.499f, 18f, 12f, 18f)
            close()
            moveTo(8.75f, 6f)
            curveTo(8.336f, 6f, 8f, 6.336f, 8f, 6.75f)
            curveTo(8f, 7.164f, 8.336f, 7.5f, 8.75f, 7.5f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 7.5f, 16f, 7.164f, 16f, 6.75f)
            curveTo(16f, 6.336f, 15.664f, 6f, 15.25f, 6f)
            horizontalLineTo(8.75f)
            close()
            moveTo(8f, 10.75f)
            curveTo(8f, 11.164f, 8.336f, 11.5f, 8.75f, 11.5f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 11.5f, 14f, 11.164f, 14f, 10.75f)
            curveTo(14f, 10.336f, 13.664f, 10f, 13.25f, 10f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 10f, 8f, 10.336f, 8f, 10.75f)
            close()
            moveTo(1.75f, 11f)
            curveTo(1.336f, 11f, 1f, 11.336f, 1f, 11.75f)
            verticalLineTo(14.75f)
            curveTo(1f, 15.164f, 1.336f, 15.5f, 1.75f, 15.5f)
            curveTo(2.164f, 15.5f, 2.5f, 15.164f, 2.5f, 14.75f)
            verticalLineTo(13.719f)
            curveTo(2.818f, 14.006f, 3.195f, 14.312f, 3.636f, 14.617f)
            curveTo(5.379f, 15.823f, 8.089f, 17f, 12f, 17f)
            curveTo(15.911f, 17f, 18.621f, 15.823f, 20.364f, 14.617f)
            curveTo(20.805f, 14.312f, 21.182f, 14.006f, 21.5f, 13.719f)
            verticalLineTo(14.75f)
            curveTo(21.5f, 15.164f, 21.836f, 15.5f, 22.25f, 15.5f)
            curveTo(22.664f, 15.5f, 23f, 15.164f, 23f, 14.75f)
            verticalLineTo(11.75f)
            curveTo(23f, 11.336f, 22.664f, 11f, 22.25f, 11f)
            horizontalLineTo(19.25f)
            curveTo(18.836f, 11f, 18.5f, 11.336f, 18.5f, 11.75f)
            curveTo(18.5f, 12.164f, 18.836f, 12.5f, 19.25f, 12.5f)
            horizontalLineTo(20.61f)
            curveTo(20.315f, 12.776f, 19.95f, 13.079f, 19.511f, 13.383f)
            curveTo(18.004f, 14.427f, 15.589f, 15.5f, 12f, 15.5f)
            curveTo(8.411f, 15.5f, 5.996f, 14.427f, 4.489f, 13.383f)
            curveTo(4.05f, 13.079f, 3.686f, 12.776f, 3.391f, 12.5f)
            horizontalLineTo(4.75f)
            curveTo(5.164f, 12.5f, 5.5f, 12.164f, 5.5f, 11.75f)
            curveTo(5.5f, 11.336f, 5.164f, 11f, 4.75f, 11f)
            horizontalLineTo(1.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CardUiPortraitFlipPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CardUiPortraitFlip, contentDescription = null)
    }
}
