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
package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Colored.AlertUrgent: ImageVector
    get() {
        if (_AlertUrgent != null) {
            return _AlertUrgent!!
        }
        _AlertUrgent = ImageVector.Builder(
            name = "Colored.AlertUrgent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEB4824),
                        1f to Color(0xFBFFCD0F)
                    ),
                    start = Offset(11.438f, 18.188f),
                    end = Offset(12.756f, 21f)
                )
            ) {
                moveTo(14.25f, 18.75f)
                curveTo(14.25f, 19.993f, 13.243f, 21f, 12f, 21f)
                curveTo(10.757f, 21f, 9.75f, 19.993f, 9.75f, 18.75f)
                curveTo(9.75f, 17.507f, 10.757f, 16.5f, 12f, 16.5f)
                curveTo(13.243f, 16.5f, 14.25f, 17.507f, 14.25f, 18.75f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF6F47),
                        1f to Color(0xFFFFCD0F)
                    ),
                    start = Offset(17.259f, 16.64f),
                    end = Offset(4.822f, 8.252f)
                )
            ) {
                moveTo(6.711f, 6.515f)
                curveTo(9.573f, 5.241f, 12.916f, 6.446f, 14.311f, 9.261f)
                lineTo(14.409f, 9.47f)
                lineTo(15.697f, 12.362f)
                lineTo(17.395f, 13.832f)
                curveTo(17.488f, 13.912f, 17.568f, 14.005f, 17.661f, 14.156f)
                lineTo(17.72f, 14.271f)
                curveTo(17.999f, 14.902f, 17.714f, 15.64f, 17.083f, 15.92f)
                lineTo(6.756f, 20.49f)
                curveTo(6.597f, 20.56f, 6.424f, 20.597f, 6.25f, 20.597f)
                curveTo(5.56f, 20.597f, 5f, 20.037f, 5f, 19.347f)
                lineTo(4.999f, 17.004f)
                lineTo(3.757f, 14.213f)
                curveTo(2.443f, 11.263f, 3.766f, 7.827f, 6.711f, 6.515f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.125f to Color(0xFF9C6CFE),
                        1f to Color(0xFF5B2AB5)
                    ),
                    start = Offset(16.296f, 3.525f),
                    end = Offset(20.981f, 14.356f)
                )
            ) {
                moveTo(15.861f, 2.094f)
                curveTo(17.947f, 3.233f, 19.513f, 4.696f, 20.543f, 6.481f)
                curveTo(21.573f, 8.265f, 22.058f, 10.353f, 22.001f, 12.729f)
                curveTo(21.992f, 13.143f, 21.648f, 13.47f, 21.234f, 13.461f)
                curveTo(20.82f, 13.451f, 20.492f, 13.107f, 20.502f, 12.693f)
                curveTo(20.552f, 10.582f, 20.13f, 8.766f, 19.244f, 7.231f)
                curveTo(18.358f, 5.695f, 16.995f, 4.422f, 15.142f, 3.41f)
                curveTo(14.779f, 3.211f, 14.645f, 2.756f, 14.844f, 2.392f)
                curveTo(15.042f, 2.029f, 15.498f, 1.895f, 15.861f, 2.094f)
                close()
                moveTo(15.624f, 5.694f)
                curveTo(16.591f, 6.221f, 17.366f, 6.989f, 17.94f, 7.983f)
                curveTo(18.514f, 8.978f, 18.791f, 10.033f, 18.764f, 11.134f)
                curveTo(18.754f, 11.548f, 18.41f, 11.876f, 17.996f, 11.866f)
                curveTo(17.582f, 11.856f, 17.255f, 11.512f, 17.265f, 11.097f)
                curveTo(17.285f, 10.276f, 17.079f, 9.493f, 16.641f, 8.733f)
                curveTo(16.203f, 7.974f, 15.627f, 7.405f, 14.906f, 7.011f)
                curveTo(14.542f, 6.813f, 14.408f, 6.357f, 14.606f, 5.994f)
                curveTo(14.804f, 5.63f, 15.26f, 5.496f, 15.624f, 5.694f)
                close()
            }
        }.build()

        return _AlertUrgent!!
    }

@Suppress("ObjectPropertyName")
private var _AlertUrgent: ImageVector? = null

@Preview
@Composable
private fun AlertUrgentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Colored.AlertUrgent, contentDescription = null)
    }
}
