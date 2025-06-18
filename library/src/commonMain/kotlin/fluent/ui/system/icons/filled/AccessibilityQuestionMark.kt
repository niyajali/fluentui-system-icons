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

public val FluentIcons.Filled.AccessibilityQuestionMark: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.AccessibilityQuestionMark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 6.5f)
                curveTo(13.243f, 6.5f, 14.25f, 5.493f, 14.25f, 4.25f)
                curveTo(14.25f, 3.007f, 13.243f, 2f, 12f, 2f)
                curveTo(10.758f, 2f, 9.75f, 3.007f, 9.75f, 4.25f)
                curveTo(9.75f, 5.493f, 10.758f, 6.5f, 12f, 6.5f)
                close()
                moveTo(6.15f, 4.178f)
                curveTo(5.007f, 3.693f, 3.682f, 4.222f, 3.189f, 5.362f)
                curveTo(2.693f, 6.505f, 3.223f, 7.829f, 4.37f, 8.316f)
                lineTo(7.393f, 9.6f)
                curveTo(7.763f, 9.756f, 8.003f, 10.119f, 8.003f, 10.52f)
                verticalLineTo(13.56f)
                lineTo(6.124f, 19.017f)
                curveTo(5.719f, 20.192f, 6.344f, 21.472f, 7.519f, 21.877f)
                curveTo(8.694f, 22.281f, 9.974f, 21.657f, 10.379f, 20.482f)
                lineTo(10.524f, 20.06f)
                curveTo(10.187f, 19.274f, 10f, 18.409f, 10f, 17.5f)
                curveTo(10f, 14.078f, 12.645f, 11.273f, 16.003f, 11.019f)
                verticalLineTo(10.518f)
                curveTo(16.003f, 10.117f, 16.243f, 9.754f, 16.612f, 9.598f)
                lineTo(19.631f, 8.316f)
                curveTo(20.778f, 7.829f, 21.307f, 6.505f, 20.812f, 5.362f)
                curveTo(20.318f, 4.222f, 18.993f, 3.693f, 17.85f, 4.178f)
                lineTo(16.244f, 4.86f)
                curveTo(15.904f, 5.004f, 15.666f, 5.283f, 15.55f, 5.591f)
                curveTo(15.008f, 7.025f, 13.622f, 8.043f, 12f, 8.043f)
                curveTo(10.379f, 8.043f, 8.993f, 7.025f, 8.451f, 5.591f)
                curveTo(8.335f, 5.283f, 8.097f, 5.004f, 7.756f, 4.86f)
                lineTo(6.15f, 4.178f)
                close()
                moveTo(11f, 17.5f)
                curveTo(11f, 14.462f, 13.463f, 12f, 16.5f, 12f)
                curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
                curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
                curveTo(13.463f, 23f, 11f, 20.538f, 11f, 17.5f)
                close()
                moveTo(15.75f, 20.75f)
                curveTo(15.75f, 21.164f, 16.086f, 21.5f, 16.5f, 21.5f)
                curveTo(16.915f, 21.5f, 17.25f, 21.164f, 17.25f, 20.75f)
                curveTo(17.25f, 20.336f, 16.915f, 20f, 16.5f, 20f)
                curveTo(16.086f, 20f, 15.75f, 20.336f, 15.75f, 20.75f)
                close()
                moveTo(14.5f, 16f)
                curveTo(14.5f, 16.276f, 14.724f, 16.5f, 15f, 16.5f)
                curveTo(15.276f, 16.5f, 15.5f, 16.276f, 15.5f, 16f)
                curveTo(15.5f, 15.448f, 15.948f, 15f, 16.5f, 15f)
                curveTo(17.053f, 15f, 17.5f, 15.448f, 17.5f, 16f)
                curveTo(17.5f, 16.371f, 17.418f, 16.579f, 17.134f, 16.897f)
                lineTo(17.018f, 17.022f)
                lineTo(16.754f, 17.292f)
                curveTo(16.212f, 17.86f, 16f, 18.27f, 16f, 19f)
                curveTo(16f, 19.276f, 16.224f, 19.5f, 16.5f, 19.5f)
                curveTo(16.777f, 19.5f, 17f, 19.276f, 17f, 19f)
                curveTo(17f, 18.629f, 17.083f, 18.421f, 17.366f, 18.103f)
                lineTo(17.482f, 17.978f)
                lineTo(17.746f, 17.708f)
                curveTo(18.289f, 17.14f, 18.5f, 16.73f, 18.5f, 16f)
                curveTo(18.5f, 14.895f, 17.605f, 14f, 16.5f, 14f)
                curveTo(15.396f, 14f, 14.5f, 14.895f, 14.5f, 16f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun AccessibilityQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AccessibilityQuestionMark, contentDescription = null)
    }
}
