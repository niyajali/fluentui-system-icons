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
package fluent.ui.system.icons.color

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

public val FluentIcons.Color.Drafts: ImageVector
    get() {
        if (_Drafts != null) {
            return _Drafts!!
        }
        _Drafts = ImageVector.Builder(
            name = "Colored.Drafts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(-0.4f, 1.571f),
                    end = Offset(5.356f, 17.095f)
                )
            ) {
                moveTo(2f, 4f)
                curveTo(2f, 3.448f, 2.448f, 3f, 3f, 3f)
                horizontalLineTo(17f)
                curveTo(17.552f, 3f, 18f, 3.448f, 18f, 4f)
                curveTo(18f, 4.552f, 17.552f, 5f, 17f, 5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 5f, 2f, 4.552f, 2f, 4f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(11.143f, 14.25f),
                    radius = 16.481f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(2f, 4f)
                curveTo(2f, 3.448f, 2.448f, 3f, 3f, 3f)
                horizontalLineTo(17f)
                curveTo(17.552f, 3f, 18f, 3.448f, 18f, 4f)
                curveTo(18f, 4.552f, 17.552f, 5f, 17f, 5f)
                horizontalLineTo(3f)
                curveTo(2.448f, 5f, 2f, 4.552f, 2f, 4f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(-0.4f, 1.571f),
                    end = Offset(5.356f, 17.095f)
                )
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 7.448f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(14f)
                curveTo(14.552f, 7f, 15f, 7.448f, 15f, 8f)
                curveTo(15f, 8.552f, 14.552f, 9f, 14f, 9f)
                horizontalLineTo(3f)
                curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(11.143f, 14.25f),
                    radius = 16.481f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 7.448f, 2.448f, 7f, 3f, 7f)
                horizontalLineTo(14f)
                curveTo(14.552f, 7f, 15f, 7.448f, 15f, 8f)
                curveTo(15f, 8.552f, 14.552f, 9f, 14f, 9f)
                horizontalLineTo(3f)
                curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF36DFF1),
                        1f to Color(0xFF0094F0)
                    ),
                    start = Offset(-0.4f, 1.571f),
                    end = Offset(5.356f, 17.095f)
                )
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(11f)
                curveTo(11.552f, 11f, 12f, 11.448f, 12f, 12f)
                curveTo(12f, 12.552f, 11.552f, 13f, 11f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                close()
            }
            path(
                fill = Brush.radialGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF4A43CB),
                        1f to Color(0x004A43CB)
                    ),
                    center = Offset(11.143f, 14.25f),
                    radius = 16.481f
                ),
                fillAlpha = 0.7f,
            ) {
                moveTo(2f, 12f)
                curveTo(2f, 11.448f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(11f)
                curveTo(11.552f, 11f, 12f, 11.448f, 12f, 12f)
                curveTo(12f, 12.552f, 11.552f, 13f, 11f, 13f)
                horizontalLineTo(3f)
                curveTo(2.448f, 13f, 2f, 12.552f, 2f, 12f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFA43D),
                        1f to Color(0xFFFB5937)
                    ),
                    start = Offset(13.137f, 8.468f),
                    end = Offset(15.444f, 14.709f)
                )
            ) {
                moveTo(3.587f, 15.353f)
                lineTo(14.646f, 4.294f)
                lineTo(19.707f, 9.354f)
                lineTo(8.648f, 20.414f)
                lineTo(4.704f, 19.298f)
                lineTo(3.587f, 15.353f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0.255f to Color(0xFFFFD394),
                        1f to Color(0xFFFF921F)
                    ),
                    start = Offset(0.997f, 16.951f),
                    end = Offset(6.044f, 21.967f)
                )
            ) {
                moveTo(3.941f, 15f)
                curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
                lineTo(2.02f, 21.078f)
                curveTo(1.96f, 21.331f, 2.036f, 21.597f, 2.22f, 21.782f)
                curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
                lineTo(7.525f, 20.885f)
                curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
                curveTo(9.002f, 20.06f, 7.178f, 19.65f, 5.764f, 18.237f)
                curveTo(4.349f, 16.822f, 3.941f, 15f, 3.941f, 15f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFF97DBD),
                        1f to Color(0xFFDD3CE2)
                    ),
                    start = Offset(20.24f, 3.751f),
                    end = Offset(17.137f, 6.668f)
                )
            ) {
                moveTo(20.952f, 3.048f)
                curveTo(19.554f, 1.651f, 17.288f, 1.651f, 15.891f, 3.048f)
                lineTo(13.585f, 5.354f)
                lineTo(18.646f, 10.415f)
                lineTo(20.952f, 8.109f)
                curveTo(22.349f, 6.711f, 22.349f, 4.445f, 20.952f, 3.048f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFF921F),
                        1f to Color(0xFFFFE994)
                    ),
                    start = Offset(16.495f, 8.955f),
                    end = Offset(11.42f, 6.736f)
                )
            ) {
                moveTo(12.78f, 6.161f)
                lineTo(14.901f, 4.039f)
                curveTo(14.901f, 4.039f, 15.31f, 5.862f, 16.724f, 7.276f)
                curveTo(18.138f, 8.69f, 19.961f, 9.099f, 19.961f, 9.099f)
                lineTo(17.841f, 11.221f)
                curveTo(17.841f, 11.221f, 16.017f, 10.812f, 14.603f, 9.398f)
                curveTo(13.188f, 7.983f, 12.78f, 6.161f, 12.78f, 6.161f)
                close()
            }
        }.build()

        return _Drafts!!
    }

@Suppress("ObjectPropertyName")
private var _Drafts: ImageVector? = null

@Preview
@Composable
private fun DraftsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Color.Drafts, contentDescription = null)
    }
}
