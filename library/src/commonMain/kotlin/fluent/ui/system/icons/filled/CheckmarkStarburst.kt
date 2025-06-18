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

public val FluentUi.Filled.CheckmarkStarburst: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CheckmarkStarburst",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.836f, 2.034f)
            curveTo(9.948f, 2.072f, 10.058f, 2.118f, 10.165f, 2.17f)
            lineTo(11.448f, 2.802f)
            curveTo(11.796f, 2.973f, 12.204f, 2.973f, 12.552f, 2.802f)
            lineTo(13.835f, 2.17f)
            curveTo(15.197f, 1.499f, 16.846f, 2.06f, 17.517f, 3.423f)
            lineTo(17.59f, 3.585f)
            lineTo(17.653f, 3.752f)
            lineTo(18.113f, 5.105f)
            curveTo(18.238f, 5.473f, 18.527f, 5.761f, 18.894f, 5.886f)
            lineTo(20.248f, 6.347f)
            curveTo(21.686f, 6.836f, 22.455f, 8.398f, 21.966f, 9.836f)
            curveTo(21.927f, 9.948f, 21.882f, 10.058f, 21.829f, 10.165f)
            lineTo(21.198f, 11.448f)
            curveTo(21.026f, 11.796f, 21.026f, 12.204f, 21.198f, 12.552f)
            lineTo(21.829f, 13.835f)
            curveTo(22.5f, 15.197f, 21.939f, 16.846f, 20.577f, 17.517f)
            curveTo(20.47f, 17.569f, 20.36f, 17.615f, 20.248f, 17.653f)
            lineTo(18.894f, 18.113f)
            curveTo(18.527f, 18.238f, 18.238f, 18.527f, 18.113f, 18.894f)
            lineTo(17.653f, 20.248f)
            curveTo(17.164f, 21.686f, 15.602f, 22.455f, 14.164f, 21.966f)
            curveTo(14.051f, 21.927f, 13.941f, 21.882f, 13.835f, 21.829f)
            lineTo(12.552f, 21.198f)
            curveTo(12.204f, 21.026f, 11.796f, 21.026f, 11.448f, 21.198f)
            lineTo(10.165f, 21.829f)
            curveTo(8.802f, 22.5f, 7.154f, 21.939f, 6.483f, 20.577f)
            curveTo(6.431f, 20.47f, 6.385f, 20.36f, 6.347f, 20.248f)
            lineTo(5.886f, 18.894f)
            curveTo(5.761f, 18.527f, 5.473f, 18.238f, 5.105f, 18.113f)
            lineTo(3.752f, 17.653f)
            curveTo(2.314f, 17.164f, 1.545f, 15.602f, 2.034f, 14.164f)
            curveTo(2.072f, 14.051f, 2.118f, 13.941f, 2.17f, 13.835f)
            lineTo(2.802f, 12.552f)
            curveTo(2.973f, 12.204f, 2.973f, 11.796f, 2.802f, 11.448f)
            lineTo(2.17f, 10.165f)
            curveTo(1.499f, 8.802f, 2.06f, 7.154f, 3.423f, 6.483f)
            curveTo(3.529f, 6.431f, 3.639f, 6.385f, 3.752f, 6.347f)
            lineTo(5.105f, 5.886f)
            curveTo(5.473f, 5.761f, 5.761f, 5.473f, 5.886f, 5.105f)
            lineTo(6.347f, 3.752f)
            curveTo(6.836f, 2.314f, 8.398f, 1.545f, 9.836f, 2.034f)
            close()
            moveTo(15.469f, 8.969f)
            lineTo(10.05f, 14.389f)
            lineTo(8.076f, 12.02f)
            curveTo(7.811f, 11.701f, 7.338f, 11.658f, 7.02f, 11.924f)
            curveTo(6.701f, 12.189f, 6.658f, 12.662f, 6.924f, 12.98f)
            lineTo(9.424f, 15.98f)
            curveTo(9.706f, 16.319f, 10.218f, 16.342f, 10.53f, 16.03f)
            lineTo(16.53f, 10.03f)
            curveTo(16.823f, 9.737f, 16.823f, 9.262f, 16.53f, 8.969f)
            curveTo(16.237f, 8.677f, 15.762f, 8.677f, 15.469f, 8.969f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkStarburstPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CheckmarkStarburst, contentDescription = null)
    }
}
