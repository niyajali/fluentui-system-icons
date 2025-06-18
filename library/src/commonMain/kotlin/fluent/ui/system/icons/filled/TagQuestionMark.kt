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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TagQuestionMark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagQuestionMark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.75f, 2f)
            curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
            verticalLineTo(9.712f)
            curveTo(22f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
            lineTo(21.022f, 12.036f)
            curveTo(20.007f, 11.38f, 18.798f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
            curveTo(11f, 18.77f, 11.364f, 19.955f, 11.994f, 20.957f)
            curveTo(10.737f, 21.757f, 9.05f, 21.61f, 7.951f, 20.514f)
            lineTo(3.489f, 16.059f)
            curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
            lineTo(11.985f, 2.953f)
            curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
            horizontalLineTo(19.75f)
            close()
            moveTo(17f, 5.502f)
            curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
            curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
            curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
            curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.537f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.537f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(16.875f, 20.504f)
            curveTo(16.875f, 20.16f, 17.155f, 19.88f, 17.5f, 19.88f)
            curveTo(17.845f, 19.88f, 18.124f, 20.16f, 18.124f, 20.504f)
            curveTo(18.124f, 20.849f, 17.845f, 21.129f, 17.5f, 21.129f)
            curveTo(17.155f, 21.129f, 16.875f, 20.849f, 16.875f, 20.504f)
            close()
            moveTo(15.646f, 15.957f)
            curveTo(15.635f, 14.821f, 16.452f, 14.003f, 17.5f, 14.003f)
            curveTo(18.531f, 14.003f, 19.353f, 14.849f, 19.353f, 15.953f)
            curveTo(19.353f, 16.519f, 19.168f, 16.866f, 18.69f, 17.4f)
            lineTo(18.424f, 17.691f)
            lineTo(18.323f, 17.806f)
            curveTo(18.076f, 18.098f, 18f, 18.268f, 18f, 18.501f)
            curveTo(18f, 18.777f, 17.776f, 19.001f, 17.5f, 19.001f)
            curveTo(17.224f, 19.001f, 17f, 18.777f, 17f, 18.501f)
            curveTo(17f, 17.926f, 17.187f, 17.575f, 17.671f, 17.033f)
            lineTo(17.936f, 16.743f)
            lineTo(18.035f, 16.63f)
            curveTo(18.278f, 16.344f, 18.353f, 16.177f, 18.353f, 15.953f)
            curveTo(18.353f, 15.395f, 17.972f, 15.003f, 17.5f, 15.003f)
            curveTo(17.006f, 15.003f, 16.641f, 15.369f, 16.646f, 15.948f)
            curveTo(16.649f, 16.224f, 16.427f, 16.45f, 16.151f, 16.453f)
            curveTo(15.875f, 16.455f, 15.649f, 16.233f, 15.646f, 15.957f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagQuestionMark, contentDescription = null)
    }
}
