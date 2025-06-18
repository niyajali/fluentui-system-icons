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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Colored.PeopleTeam: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.PeopleTeam",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF7A41DC),
                    1f to Color(0xFF5B2AB5),
                ),
                start = Offset(15.902f, 11.196f),
                end = Offset(20.703f, 18.011f),
            ),
        ) {
            moveTo(20.25f, 10f)
            curveTo(21.217f, 10f, 22f, 10.783f, 22f, 11.75f)
            verticalLineTo(15f)
            curveTo(22f, 17.1f, 20.381f, 18.823f, 18.323f, 18.987f)
            curveTo(18.217f, 18.996f, 18.109f, 19f, 18f, 19f)
            curveTo(17.867f, 19f, 17.735f, 18.993f, 17.604f, 18.981f)
            curveTo(15.58f, 18.782f, 14f, 17.075f, 14f, 14.999f)
            verticalLineTo(11.75f)
            curveTo(14f, 10.832f, 14.707f, 10.079f, 15.606f, 10.006f)
            lineTo(20.25f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.433f to Color(0xFF3B148A),
                    1f to Color(0x003B148A),
                ),
                center = Offset(12.743f, 14.289f),
                radius = 6.438f,
            ),
            fillAlpha = 0.5f,
        ) {
            moveTo(20.25f, 10f)
            curveTo(21.217f, 10f, 22f, 10.783f, 22f, 11.75f)
            verticalLineTo(15f)
            curveTo(22f, 17.1f, 20.381f, 18.823f, 18.323f, 18.987f)
            curveTo(18.217f, 18.996f, 18.109f, 19f, 18f, 19f)
            curveTo(17.867f, 19f, 17.735f, 18.993f, 17.604f, 18.981f)
            curveTo(15.58f, 18.782f, 14f, 17.075f, 14f, 14.999f)
            verticalLineTo(11.75f)
            curveTo(14f, 10.832f, 14.707f, 10.079f, 15.606f, 10.006f)
            lineTo(20.25f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(3.903f, 11.196f),
                end = Offset(8.703f, 18.011f),
            ),
        ) {
            moveTo(8.25f, 10f)
            curveTo(9.217f, 10f, 10f, 10.783f, 10f, 11.75f)
            verticalLineTo(15f)
            curveTo(10f, 17.1f, 8.381f, 18.823f, 6.323f, 18.987f)
            curveTo(6.217f, 18.996f, 6.109f, 19f, 6f, 19f)
            curveTo(5.867f, 19f, 5.735f, 18.993f, 5.604f, 18.981f)
            curveTo(3.58f, 18.782f, 2f, 17.075f, 2f, 14.999f)
            verticalLineTo(11.75f)
            curveTo(2f, 10.832f, 2.707f, 10.079f, 3.606f, 10.006f)
            lineTo(8.25f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.433f to Color(0xFF3B148A),
                    1f to Color(0x003B148A),
                ),
                center = Offset(12.592f, 14.289f),
                radius = 7.125f,
            ),
            fillAlpha = 0.5f,
        ) {
            moveTo(8.25f, 10f)
            curveTo(9.217f, 10f, 10f, 10.783f, 10f, 11.75f)
            verticalLineTo(15f)
            curveTo(10f, 17.1f, 8.381f, 18.823f, 6.323f, 18.987f)
            curveTo(6.217f, 18.996f, 6.109f, 19f, 6f, 19f)
            curveTo(5.867f, 19f, 5.735f, 18.993f, 5.604f, 18.981f)
            curveTo(3.58f, 18.782f, 2f, 17.075f, 2f, 14.999f)
            verticalLineTo(11.75f)
            curveTo(2f, 10.832f, 2.707f, 10.079f, 3.606f, 10.006f)
            lineTo(8.25f, 10f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE),
                ),
                start = Offset(9.643f, 11.462f),
                end = Offset(15.657f, 19.322f),
            ),
        ) {
            moveTo(14.754f, 10f)
            curveTo(15.72f, 10f, 16.504f, 10.783f, 16.504f, 11.75f)
            verticalLineTo(16.499f)
            curveTo(16.504f, 18.985f, 14.489f, 21f, 12.003f, 21f)
            curveTo(9.517f, 21f, 7.502f, 18.985f, 7.502f, 16.499f)
            verticalLineTo(11.75f)
            curveTo(7.502f, 10.783f, 8.285f, 10f, 9.252f, 10f)
            horizontalLineTo(14.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8),
                ),
                start = Offset(12.003f, 8.69f),
                end = Offset(21.131f, 22.648f),
            ),
        ) {
            moveTo(14.754f, 10f)
            curveTo(15.72f, 10f, 16.504f, 10.783f, 16.504f, 11.75f)
            verticalLineTo(16.499f)
            curveTo(16.504f, 18.985f, 14.489f, 21f, 12.003f, 21f)
            curveTo(9.517f, 21f, 7.502f, 18.985f, 7.502f, 16.499f)
            verticalLineTo(11.75f)
            curveTo(7.502f, 10.783f, 8.285f, 10f, 9.252f, 10f)
            horizontalLineTo(14.754f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF7A41DC),
                    1f to Color(0xFF5B2AB5),
                ),
                start = Offset(17.189f, 4.665f),
                end = Offset(19.737f, 8.734f),
            ),
        ) {
            moveTo(18.5f, 4f)
            curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
            curveTo(21f, 7.881f, 19.881f, 9f, 18.5f, 9f)
            curveTo(17.119f, 9f, 16f, 7.881f, 16f, 6.5f)
            curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC),
                ),
                start = Offset(4.189f, 4.665f),
                end = Offset(6.737f, 8.734f),
            ),
        ) {
            moveTo(5.5f, 4f)
            curveTo(6.881f, 4f, 8f, 5.119f, 8f, 6.5f)
            curveTo(8f, 7.881f, 6.881f, 9f, 5.5f, 9f)
            curveTo(4.119f, 9f, 3f, 7.881f, 3f, 6.5f)
            curveTo(3f, 5.119f, 4.119f, 4f, 5.5f, 4f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125f to Color(0xFFBD96FF),
                    1f to Color(0xFF9C6CFE),
                ),
                start = Offset(10.427f, 3.798f),
                end = Offset(13.485f, 8.68f),
            ),
        ) {
            moveTo(12f, 3f)
            curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
            curveTo(15f, 7.657f, 13.657f, 9f, 12f, 9f)
            curveTo(10.343f, 9f, 9f, 7.657f, 9f, 6f)
            curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleTeamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.PeopleTeam, contentDescription = null)
    }
}
