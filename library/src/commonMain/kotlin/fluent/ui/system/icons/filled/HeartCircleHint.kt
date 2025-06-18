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

public val FluentUi.Filled.HeartCircleHint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartCircleHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.678f, 2.087f)
            curveTo(11.111f, 2.029f, 11.552f, 2f, 12f, 2f)
            curveTo(12.448f, 2f, 12.889f, 2.029f, 13.322f, 2.087f)
            curveTo(13.733f, 2.141f, 14.021f, 2.518f, 13.967f, 2.928f)
            curveTo(13.913f, 3.339f, 13.536f, 3.628f, 13.125f, 3.574f)
            curveTo(12.757f, 3.525f, 12.382f, 3.5f, 12f, 3.5f)
            curveTo(11.618f, 3.5f, 11.243f, 3.525f, 10.875f, 3.574f)
            curveTo(10.464f, 3.628f, 10.087f, 3.339f, 10.033f, 2.928f)
            curveTo(9.978f, 2.518f, 10.267f, 2.141f, 10.678f, 2.087f)
            close()
            moveTo(21.072f, 10.033f)
            curveTo(21.482f, 9.978f, 21.859f, 10.267f, 21.913f, 10.678f)
            curveTo(21.971f, 11.111f, 22f, 11.552f, 22f, 12f)
            curveTo(22f, 12.448f, 21.971f, 12.889f, 21.913f, 13.322f)
            curveTo(21.859f, 13.733f, 21.482f, 14.021f, 21.072f, 13.967f)
            curveTo(20.661f, 13.913f, 20.372f, 13.536f, 20.426f, 13.125f)
            curveTo(20.475f, 12.757f, 20.5f, 12.382f, 20.5f, 12f)
            curveTo(20.5f, 11.618f, 20.475f, 11.243f, 20.426f, 10.875f)
            curveTo(20.372f, 10.464f, 20.661f, 10.087f, 21.072f, 10.033f)
            close()
            moveTo(2.928f, 10.033f)
            curveTo(3.339f, 10.087f, 3.628f, 10.464f, 3.574f, 10.875f)
            curveTo(3.525f, 11.243f, 3.5f, 11.618f, 3.5f, 12f)
            curveTo(3.5f, 12.382f, 3.525f, 12.757f, 3.574f, 13.125f)
            curveTo(3.628f, 13.536f, 3.339f, 13.913f, 2.928f, 13.967f)
            curveTo(2.518f, 14.021f, 2.141f, 13.733f, 2.087f, 13.322f)
            curveTo(2.029f, 12.889f, 2f, 12.448f, 2f, 12f)
            curveTo(2f, 11.552f, 2.029f, 11.111f, 2.087f, 10.678f)
            curveTo(2.141f, 10.267f, 2.518f, 9.978f, 2.928f, 10.033f)
            close()
            moveTo(10.033f, 21.072f)
            curveTo(10.087f, 20.661f, 10.464f, 20.372f, 10.875f, 20.426f)
            curveTo(11.243f, 20.475f, 11.618f, 20.5f, 12f, 20.5f)
            curveTo(12.382f, 20.5f, 12.757f, 20.475f, 13.125f, 20.426f)
            curveTo(13.536f, 20.372f, 13.913f, 20.661f, 13.967f, 21.072f)
            curveTo(14.021f, 21.482f, 13.733f, 21.859f, 13.322f, 21.913f)
            curveTo(12.889f, 21.971f, 12.448f, 22f, 12f, 22f)
            curveTo(11.552f, 22f, 11.111f, 21.971f, 10.678f, 21.913f)
            curveTo(10.267f, 21.859f, 9.978f, 21.482f, 10.033f, 21.072f)
            close()
            moveTo(18.075f, 4.056f)
            curveTo(18.421f, 4.322f, 18.754f, 4.613f, 19.071f, 4.929f)
            curveTo(19.388f, 5.246f, 19.679f, 5.579f, 19.945f, 5.925f)
            curveTo(20.197f, 6.254f, 20.134f, 6.725f, 19.806f, 6.977f)
            curveTo(19.477f, 7.229f, 19.006f, 7.167f, 18.754f, 6.838f)
            curveTo(18.528f, 6.543f, 18.281f, 6.26f, 18.01f, 5.99f)
            curveTo(17.74f, 5.72f, 17.457f, 5.472f, 17.162f, 5.246f)
            curveTo(16.834f, 4.994f, 16.771f, 4.524f, 17.024f, 4.195f)
            curveTo(17.275f, 3.866f, 17.746f, 3.804f, 18.075f, 4.056f)
            close()
            moveTo(19.806f, 17.024f)
            curveTo(20.134f, 17.276f, 20.197f, 17.747f, 19.945f, 18.075f)
            curveTo(19.679f, 18.422f, 19.388f, 18.755f, 19.071f, 19.072f)
            curveTo(18.754f, 19.388f, 18.421f, 19.679f, 18.075f, 19.945f)
            curveTo(17.746f, 20.197f, 17.275f, 20.135f, 17.024f, 19.806f)
            curveTo(16.771f, 19.477f, 16.834f, 19.007f, 17.162f, 18.754f)
            curveTo(17.457f, 18.529f, 17.74f, 18.281f, 18.01f, 18.011f)
            curveTo(18.281f, 17.741f, 18.528f, 17.457f, 18.754f, 17.163f)
            curveTo(19.006f, 16.834f, 19.477f, 16.772f, 19.806f, 17.024f)
            close()
            moveTo(6.977f, 4.195f)
            curveTo(7.229f, 4.524f, 7.166f, 4.994f, 6.838f, 5.246f)
            curveTo(6.543f, 5.472f, 6.26f, 5.72f, 5.99f, 5.99f)
            curveTo(5.72f, 6.26f, 5.472f, 6.543f, 5.246f, 6.838f)
            curveTo(4.994f, 7.167f, 4.523f, 7.229f, 4.194f, 6.977f)
            curveTo(3.866f, 6.725f, 3.803f, 6.254f, 4.055f, 5.925f)
            curveTo(4.321f, 5.579f, 4.612f, 5.246f, 4.929f, 4.929f)
            curveTo(5.246f, 4.613f, 5.578f, 4.322f, 5.925f, 4.056f)
            curveTo(6.254f, 3.804f, 6.725f, 3.866f, 6.977f, 4.195f)
            close()
            moveTo(4.194f, 17.024f)
            curveTo(4.523f, 16.772f, 4.994f, 16.834f, 5.246f, 17.163f)
            curveTo(5.472f, 17.457f, 5.72f, 17.741f, 5.99f, 18.011f)
            curveTo(6.26f, 18.281f, 6.543f, 18.529f, 6.838f, 18.754f)
            curveTo(7.166f, 19.007f, 7.229f, 19.477f, 6.977f, 19.806f)
            curveTo(6.725f, 20.135f, 6.254f, 20.197f, 5.925f, 19.945f)
            curveTo(5.578f, 19.679f, 5.246f, 19.388f, 4.929f, 19.072f)
            curveTo(4.612f, 18.755f, 4.321f, 18.422f, 4.055f, 18.075f)
            curveTo(3.803f, 17.747f, 3.866f, 17.276f, 4.194f, 17.024f)
            close()
            moveTo(16.344f, 8.913f)
            curveTo(15.331f, 7.747f, 13.539f, 7.69f, 12.453f, 8.789f)
            lineTo(11.998f, 9.251f)
            lineTo(11.542f, 8.789f)
            curveTo(10.456f, 7.69f, 8.664f, 7.747f, 7.651f, 8.913f)
            curveTo(6.783f, 9.911f, 6.783f, 11.396f, 7.651f, 12.394f)
            lineTo(11.432f, 16.744f)
            curveTo(11.574f, 16.908f, 11.78f, 17.002f, 11.998f, 17.002f)
            curveTo(12.215f, 17.002f, 12.421f, 16.908f, 12.564f, 16.744f)
            lineTo(16.344f, 12.394f)
            curveTo(17.212f, 11.396f, 17.212f, 9.911f, 16.344f, 8.913f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartCircleHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.HeartCircleHint, contentDescription = null)
    }
}
