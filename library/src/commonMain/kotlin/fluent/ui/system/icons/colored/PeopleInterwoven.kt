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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.PeopleInterwoven: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.PeopleInterwoven",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.136f to Color(0xFF003580),
                    0.366f to Color(0xFF0057AA),
                    1f to Color(0xFF0FAFFF)
                ),
                center = Offset(9.558f, 14.334f),
                radius = 14.314f
            )
        ) {
            moveTo(16.637f, 21.393f)
            curveTo(19.172f, 21.393f, 20.938f, 18.456f, 21.852f, 16.962f)
            curveTo(22.072f, 16.604f, 22.047f, 16.153f, 21.778f, 15.826f)
            lineTo(18.431f, 11.763f)
            curveTo(17.554f, 10.698f, 15.811f, 10.758f, 15.021f, 11.88f)
            lineTo(13.999f, 13.336f)
            curveTo(13.999f, 13.336f, 13.323f, 13.994f, 12.928f, 13.994f)
            curveTo(12.532f, 13.994f, 10.39f, 15.744f, 10.39f, 15.744f)
            lineTo(9.543f, 19.689f)
            curveTo(10.573f, 18.221f, 11.34f, 18.736f, 11.856f, 19.007f)
            curveTo(13.422f, 19.827f, 14.744f, 21.393f, 16.637f, 21.393f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    0.407f to Color(0x5676EB95),
                    1f to Color(0x0076EB95)
                ),
                center = Offset(8.713f, 13.969f),
                radius = 7.323f
            ),
            fillAlpha = 0.5f
        ) {
            moveTo(16.637f, 21.393f)
            curveTo(19.172f, 21.393f, 20.938f, 18.456f, 21.852f, 16.962f)
            curveTo(22.072f, 16.604f, 22.047f, 16.153f, 21.778f, 15.826f)
            lineTo(18.431f, 11.763f)
            curveTo(17.554f, 10.698f, 15.811f, 10.758f, 15.021f, 11.88f)
            lineTo(13.999f, 13.336f)
            curveTo(13.999f, 13.336f, 13.323f, 13.994f, 12.928f, 13.994f)
            curveTo(12.532f, 13.994f, 10.39f, 15.744f, 10.39f, 15.744f)
            lineTo(9.543f, 19.689f)
            curveTo(10.573f, 18.221f, 11.34f, 18.736f, 11.856f, 19.007f)
            curveTo(13.422f, 19.827f, 14.744f, 21.393f, 16.637f, 21.393f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF0095FF)
                ),
                start = Offset(13.211f, 11f),
                end = Offset(8.351f, 23.183f)
            )
        ) {
            moveTo(7.363f, 11f)
            curveTo(4.828f, 11f, 3.062f, 13.937f, 2.148f, 15.431f)
            curveTo(1.929f, 15.789f, 1.953f, 16.24f, 2.222f, 16.567f)
            lineTo(5.569f, 20.63f)
            curveTo(6.446f, 21.695f, 8.189f, 21.635f, 8.979f, 20.513f)
            lineTo(14.457f, 12.704f)
            curveTo(13.427f, 14.172f, 12.66f, 13.657f, 12.144f, 13.386f)
            curveTo(10.579f, 12.566f, 9.256f, 11f, 7.363f, 11f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    0.443f to Color(0xFF13ACCF),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(14.041f, 11.393f),
                radius = 12.272f
            )
        ) {
            moveTo(7.363f, 11f)
            curveTo(4.828f, 11f, 3.062f, 13.937f, 2.148f, 15.431f)
            curveTo(1.929f, 15.789f, 1.953f, 16.24f, 2.222f, 16.567f)
            lineTo(5.569f, 20.63f)
            curveTo(6.446f, 21.695f, 8.189f, 21.635f, 8.979f, 20.513f)
            lineTo(14.457f, 12.704f)
            curveTo(13.427f, 14.172f, 12.66f, 13.657f, 12.144f, 13.386f)
            curveTo(10.579f, 12.566f, 9.256f, 11f, 7.363f, 11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x0016BBDA),
                    1f to Color(0xFF76EB95)
                ),
                start = Offset(7f, 17.242f),
                end = Offset(6.615f, 9.676f)
            )
        ) {
            moveTo(7.363f, 11f)
            curveTo(4.828f, 11f, 3.062f, 13.937f, 2.148f, 15.431f)
            curveTo(1.929f, 15.789f, 1.953f, 16.24f, 2.222f, 16.567f)
            lineTo(5.569f, 20.63f)
            curveTo(6.446f, 21.695f, 8.189f, 21.635f, 8.979f, 20.513f)
            lineTo(14.457f, 12.704f)
            curveTo(13.427f, 14.172f, 12.66f, 13.657f, 12.144f, 13.386f)
            curveTo(10.579f, 12.566f, 9.256f, 11f, 7.363f, 11f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF006EE3)
                ),
                start = Offset(5.5f, 3f),
                end = Offset(8.397f, 8.725f)
            )
        ) {
            moveTo(7f, 6f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    0.518f to Color(0xFF16BBDA),
                    0.75f to Color(0xFF119FC5),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(7.4f, 3f),
                radius = 6.093f
            )
        ) {
            moveTo(7f, 6f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    1f to Color(0x0016BBDA)
                ),
                center = Offset(8.908f, 3.818f),
                radius = 7.159f
            )
        ) {
            moveTo(7f, 6f)
            moveToRelative(-3f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF3BD5FF),
                    1f to Color(0xFF006EE3)
                ),
                start = Offset(15.5f, 3f),
                end = Offset(18.397f, 8.724f)
            )
        ) {
            moveTo(14f, 6f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.998f, 0f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.998f, 0f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF2BDABE),
                    0.518f to Color(0xFF16BBDA),
                    0.75f to Color(0xFF119FC5),
                    1f to Color(0xFF0078D4)
                ),
                center = Offset(17.399f, 3f),
                radius = 6.092f
            )
        ) {
            moveTo(14f, 6f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.998f, 0f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.998f, 0f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF76EB95),
                    1f to Color(0x0016BBDA)
                ),
                center = Offset(18.906f, 3.818f),
                radius = 7.158f
            )
        ) {
            moveTo(14f, 6f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.998f, 0f)
            arcToRelative(2.999f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.998f, 0f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleInterwovenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.PeopleInterwoven, contentDescription = null)
    }
}
