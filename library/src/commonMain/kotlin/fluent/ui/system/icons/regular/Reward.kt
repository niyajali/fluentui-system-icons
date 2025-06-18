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

public val FluentUi.Regular.Reward: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Reward",
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
            lineTo(14.241f, 12.51f)
            curveTo(15.877f, 13.331f, 17f, 15.025f, 17f, 16.98f)
            curveTo(17f, 19.742f, 14.761f, 21.98f, 12f, 21.98f)
            curveTo(9.239f, 21.98f, 7f, 19.742f, 7f, 16.98f)
            curveTo(7f, 15.025f, 8.123f, 13.331f, 9.759f, 12.51f)
            lineTo(3.477f, 9.229f)
            curveTo(2.569f, 8.755f, 2f, 7.816f, 2f, 6.792f)
            verticalLineTo(3.749f)
            curveTo(2f, 2.783f, 2.783f, 1.999f, 3.75f, 1.999f)
            horizontalLineTo(20.25f)
            close()
            moveTo(12f, 13.48f)
            curveTo(10.067f, 13.48f, 8.5f, 15.047f, 8.5f, 16.98f)
            curveTo(8.5f, 18.913f, 10.067f, 20.48f, 12f, 20.48f)
            curveTo(13.933f, 20.48f, 15.5f, 18.913f, 15.5f, 16.98f)
            curveTo(15.5f, 15.047f, 13.933f, 13.48f, 12f, 13.48f)
            close()
            moveTo(15.5f, 3.498f)
            horizontalLineTo(8.5f)
            verticalLineTo(10.16f)
            lineTo(11.884f, 11.928f)
            curveTo(11.957f, 11.966f, 12.043f, 11.966f, 12.116f, 11.928f)
            lineTo(15.5f, 10.159f)
            verticalLineTo(3.498f)
            close()
            moveTo(7f, 3.498f)
            lineTo(3.75f, 3.499f)
            curveTo(3.612f, 3.499f, 3.5f, 3.611f, 3.5f, 3.749f)
            verticalLineTo(6.792f)
            curveTo(3.5f, 7.257f, 3.759f, 7.684f, 4.171f, 7.9f)
            lineTo(7f, 9.376f)
            verticalLineTo(3.498f)
            close()
            moveTo(20.25f, 3.499f)
            lineTo(17f, 3.498f)
            verticalLineTo(9.376f)
            lineTo(19.829f, 7.9f)
            curveTo(20.241f, 7.684f, 20.5f, 7.257f, 20.5f, 6.792f)
            verticalLineTo(3.749f)
            curveTo(20.5f, 3.611f, 20.388f, 3.499f, 20.25f, 3.499f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RewardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Reward, contentDescription = null)
    }
}
