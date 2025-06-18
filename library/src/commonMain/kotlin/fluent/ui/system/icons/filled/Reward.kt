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

public val FluentUi.Filled.Reward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Reward",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.25f, 1.999f)
            curveTo(21.216f, 1.999f, 22f, 2.783f, 22f, 3.749f)
            verticalLineTo(6.792f)
            curveTo(22f, 7.816f, 21.431f, 8.755f, 20.523f, 9.229f)
            lineTo(14.223f, 12.52f)
            curveTo(15.869f, 13.338f, 17f, 15.037f, 17f, 17f)
            curveTo(17f, 19.761f, 14.761f, 22f, 12f, 22f)
            curveTo(9.239f, 22f, 7f, 19.761f, 7f, 17f)
            curveTo(7f, 15.037f, 8.131f, 13.338f, 9.777f, 12.52f)
            lineTo(3.477f, 9.229f)
            curveTo(2.569f, 8.755f, 2f, 7.816f, 2f, 6.792f)
            verticalLineTo(3.749f)
            curveTo(2f, 2.783f, 2.783f, 1.999f, 3.75f, 1.999f)
            horizontalLineTo(20.25f)
            close()
            moveTo(12f, 13.5f)
            curveTo(10.067f, 13.5f, 8.5f, 15.067f, 8.5f, 17f)
            curveTo(8.5f, 18.933f, 10.067f, 20.5f, 12f, 20.5f)
            curveTo(13.933f, 20.5f, 15.5f, 18.933f, 15.5f, 17f)
            curveTo(15.5f, 15.067f, 13.933f, 13.5f, 12f, 13.5f)
            close()
            moveTo(16f, 3.499f)
            horizontalLineTo(7.997f)
            verticalLineTo(9.897f)
            lineTo(11.884f, 11.928f)
            curveTo(11.957f, 11.966f, 12.043f, 11.966f, 12.116f, 11.928f)
            lineTo(16f, 9.898f)
            verticalLineTo(3.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RewardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Reward, contentDescription = null)
    }
}
