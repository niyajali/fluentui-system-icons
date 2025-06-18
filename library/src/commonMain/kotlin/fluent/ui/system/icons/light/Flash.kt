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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Light.Flash: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Flash",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.106f, 3.368f)
            curveTo(10.378f, 2.551f, 11.142f, 2f, 12.003f, 2f)
            horizontalLineTo(20.996f)
            curveTo(22.411f, 2f, 23.379f, 3.429f, 22.853f, 4.743f)
            lineTo(20.75f, 10f)
            horizontalLineTo(24.262f)
            curveTo(25.742f, 10f, 26.553f, 11.722f, 25.612f, 12.864f)
            lineTo(12.171f, 29.143f)
            curveTo(11.724f, 29.686f, 11.057f, 30f, 10.354f, 30f)
            curveTo(8.81f, 30f, 7.684f, 28.54f, 8.076f, 27.046f)
            lineTo(10.45f, 18f)
            horizontalLineTo(8.003f)
            curveTo(6.638f, 18f, 5.674f, 16.663f, 6.106f, 15.368f)
            lineTo(10.106f, 3.368f)
            close()
            moveTo(12.003f, 3f)
            curveTo(11.573f, 3f, 11.19f, 3.275f, 11.054f, 3.684f)
            lineTo(7.054f, 15.684f)
            curveTo(6.838f, 16.331f, 7.32f, 17f, 8.003f, 17f)
            horizontalLineTo(11.099f)
            curveTo(11.254f, 17f, 11.4f, 17.072f, 11.495f, 17.195f)
            curveTo(11.589f, 17.317f, 11.622f, 17.477f, 11.582f, 17.627f)
            lineTo(9.043f, 27.3f)
            curveTo(8.818f, 28.16f, 9.466f, 29f, 10.354f, 29f)
            curveTo(10.759f, 29f, 11.142f, 28.819f, 11.4f, 28.507f)
            lineTo(24.84f, 12.227f)
            curveTo(25.244f, 11.738f, 24.896f, 11f, 24.262f, 11f)
            horizontalLineTo(20.012f)
            curveTo(19.846f, 11f, 19.691f, 10.918f, 19.598f, 10.78f)
            curveTo(19.505f, 10.643f, 19.486f, 10.468f, 19.548f, 10.314f)
            lineTo(21.925f, 4.371f)
            curveTo(22.188f, 3.715f, 21.704f, 3f, 20.996f, 3f)
            horizontalLineTo(12.003f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Flash, contentDescription = null)
    }
}
