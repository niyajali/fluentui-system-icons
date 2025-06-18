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

public val FluentUi.Filled.PeopleInterwoven: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleInterwoven",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.609f, 10.995f)
            curveTo(8.865f, 10.995f, 10.297f, 13.014f, 12.064f, 13.735f)
            curveTo(12.308f, 13.834f, 12.423f, 14.138f, 12.273f, 14.355f)
            lineTo(8.054f, 20.437f)
            curveTo(7.401f, 21.378f, 6.028f, 21.433f, 5.302f, 20.547f)
            lineTo(1.76f, 16.224f)
            curveTo(1.571f, 15.994f, 1.535f, 15.674f, 1.679f, 15.413f)
            curveTo(2.68f, 13.604f, 4.611f, 10.995f, 6.609f, 10.995f)
            close()
            moveTo(15.897f, 11.727f)
            curveTo(16.55f, 10.785f, 17.922f, 10.73f, 18.649f, 11.616f)
            lineTo(22.19f, 15.94f)
            curveTo(22.378f, 16.17f, 22.415f, 16.49f, 22.271f, 16.75f)
            curveTo(21.27f, 18.56f, 19.338f, 21.168f, 17.34f, 21.168f)
            curveTo(15.085f, 21.168f, 13.653f, 19.149f, 11.887f, 18.429f)
            curveTo(11.642f, 18.329f, 11.528f, 18.026f, 11.678f, 17.809f)
            lineTo(15.897f, 11.727f)
            close()
            moveTo(7f, 3f)
            curveTo(8.657f, 3f, 10f, 4.343f, 10f, 6f)
            curveTo(10f, 7.657f, 8.657f, 9f, 7f, 9f)
            curveTo(5.343f, 9f, 4f, 7.657f, 4f, 6f)
            curveTo(4f, 4.343f, 5.343f, 3f, 7f, 3f)
            close()
            moveTo(17f, 3f)
            curveTo(18.657f, 3f, 20f, 4.343f, 20f, 6f)
            curveTo(20f, 7.657f, 18.657f, 9f, 17f, 9f)
            curveTo(15.343f, 9f, 14f, 7.657f, 14f, 6f)
            curveTo(14f, 4.343f, 15.343f, 3f, 17f, 3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleInterwovenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleInterwoven, contentDescription = null)
    }
}
