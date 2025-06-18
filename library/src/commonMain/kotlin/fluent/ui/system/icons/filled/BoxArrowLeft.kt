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

public val FluentIcons.Filled.BoxArrowLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoxArrowLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.409f, 2.513f)
            curveTo(12.505f, 2.147f, 11.495f, 2.147f, 10.591f, 2.513f)
            lineTo(8.401f, 3.401f)
            lineTo(17.993f, 7.131f)
            lineTo(21.367f, 5.828f)
            curveTo(21.231f, 5.715f, 21.077f, 5.622f, 20.907f, 5.553f)
            lineTo(13.409f, 2.513f)
            close()
            moveTo(22f, 7.191f)
            lineTo(12.75f, 10.765f)
            verticalLineTo(13.064f)
            curveTo(13.936f, 11.795f, 15.625f, 11.001f, 17.5f, 11.001f)
            curveTo(19.247f, 11.001f, 20.832f, 11.69f, 22f, 12.811f)
            verticalLineTo(7.191f)
            close()
            moveTo(11.25f, 15.71f)
            verticalLineTo(10.765f)
            lineTo(2f, 7.191f)
            verticalLineTo(16.827f)
            curveTo(2f, 17.54f, 2.432f, 18.181f, 3.093f, 18.449f)
            lineTo(10.591f, 21.489f)
            curveTo(10.806f, 21.576f, 11.026f, 21.642f, 11.25f, 21.688f)
            verticalLineTo(19.292f)
            curveTo(11.087f, 18.723f, 11f, 18.122f, 11f, 17.501f)
            curveTo(11f, 16.88f, 11.087f, 16.279f, 11.25f, 15.71f)
            close()
            moveTo(2.633f, 5.828f)
            lineTo(12f, 9.447f)
            lineTo(15.917f, 7.933f)
            lineTo(6.374f, 4.223f)
            lineTo(3.093f, 5.553f)
            curveTo(2.923f, 5.622f, 2.769f, 5.715f, 2.633f, 5.828f)
            close()
            moveTo(17.5f, 12.001f)
            curveTo(14.462f, 12.001f, 12f, 14.463f, 12f, 17.501f)
            curveTo(12f, 20.538f, 14.462f, 23.001f, 17.5f, 23.001f)
            curveTo(20.538f, 23.001f, 23f, 20.538f, 23f, 17.501f)
            curveTo(23f, 14.463f, 20.538f, 12.001f, 17.5f, 12.001f)
            close()
            moveTo(14.002f, 17.459f)
            lineTo(14.017f, 17.373f)
            lineTo(14.038f, 17.31f)
            lineTo(14.072f, 17.243f)
            lineTo(14.104f, 17.195f)
            lineTo(16.646f, 14.647f)
            lineTo(16.716f, 14.59f)
            curveTo(16.911f, 14.455f, 17.18f, 14.474f, 17.354f, 14.647f)
            curveTo(17.527f, 14.821f, 17.546f, 15.09f, 17.411f, 15.285f)
            lineTo(17.354f, 15.354f)
            lineTo(15.706f, 17.002f)
            lineTo(21f, 17.001f)
            lineTo(21.09f, 17.009f)
            curveTo(21.294f, 17.046f, 21.455f, 17.207f, 21.492f, 17.411f)
            lineTo(21.5f, 17.501f)
            lineTo(21.492f, 17.591f)
            curveTo(21.455f, 17.795f, 21.294f, 17.956f, 21.09f, 17.993f)
            lineTo(21f, 18.001f)
            lineTo(15.708f, 18.002f)
            lineTo(17.354f, 19.647f)
            lineTo(17.411f, 19.717f)
            curveTo(17.529f, 19.887f, 17.529f, 20.115f, 17.411f, 20.285f)
            lineTo(17.354f, 20.354f)
            lineTo(17.284f, 20.412f)
            curveTo(17.114f, 20.531f, 16.886f, 20.531f, 16.716f, 20.412f)
            lineTo(16.646f, 20.354f)
            lineTo(14.134f, 17.842f)
            lineTo(14.089f, 17.786f)
            lineTo(14.047f, 17.712f)
            lineTo(14.017f, 17.629f)
            lineTo(14.005f, 17.569f)
            lineTo(14f, 17.513f)
            lineTo(14.002f, 17.459f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BoxArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BoxArrowLeft, contentDescription = null)
    }
}
