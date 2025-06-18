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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.HeadphonesSoundWave: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeadphonesSoundWave",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            verticalLineTo(14f)
            horizontalLineTo(18.25f)
            curveTo(17.836f, 14f, 17.5f, 14.336f, 17.5f, 14.75f)
            verticalLineTo(21.25f)
            curveTo(17.5f, 21.664f, 17.836f, 22f, 18.25f, 22f)
            horizontalLineTo(19f)
            curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
            verticalLineTo(12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            verticalLineTo(19f)
            curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
            horizontalLineTo(5.75f)
            curveTo(6.164f, 22f, 6.5f, 21.664f, 6.5f, 21.25f)
            verticalLineTo(14.75f)
            curveTo(6.5f, 14.336f, 6.164f, 14f, 5.75f, 14f)
            horizontalLineTo(3.5f)
            verticalLineTo(12f)
            close()
            moveTo(12.75f, 11.75f)
            curveTo(12.75f, 11.336f, 12.414f, 11f, 12f, 11f)
            curveTo(11.586f, 11f, 11.25f, 11.336f, 11.25f, 11.75f)
            verticalLineTo(22.25f)
            curveTo(11.25f, 22.664f, 11.586f, 23f, 12f, 23f)
            curveTo(12.414f, 23f, 12.75f, 22.664f, 12.75f, 22.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(8.75f, 14f)
            curveTo(9.164f, 14f, 9.5f, 14.336f, 9.5f, 14.75f)
            verticalLineTo(19.25f)
            curveTo(9.5f, 19.664f, 9.164f, 20f, 8.75f, 20f)
            curveTo(8.336f, 20f, 8f, 19.664f, 8f, 19.25f)
            verticalLineTo(14.75f)
            curveTo(8f, 14.336f, 8.336f, 14f, 8.75f, 14f)
            close()
            moveTo(16f, 14.75f)
            curveTo(16f, 14.336f, 15.664f, 14f, 15.25f, 14f)
            curveTo(14.836f, 14f, 14.5f, 14.336f, 14.5f, 14.75f)
            verticalLineTo(19.25f)
            curveTo(14.5f, 19.664f, 14.836f, 20f, 15.25f, 20f)
            curveTo(15.664f, 20f, 16f, 19.664f, 16f, 19.25f)
            verticalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadphonesSoundWavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HeadphonesSoundWave, contentDescription = null)
    }
}
