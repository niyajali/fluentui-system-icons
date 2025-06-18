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

public val FluentUi.Filled.TagSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TagSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 4.25f)
            curveTo(22f, 3.007f, 20.993f, 2f, 19.75f, 2f)
            horizontalLineTo(14.285f)
            curveTo(13.422f, 2f, 12.595f, 2.343f, 11.985f, 2.953f)
            lineTo(3.485f, 11.463f)
            curveTo(2.217f, 12.733f, 2.219f, 14.791f, 3.489f, 16.059f)
            lineTo(7.951f, 20.514f)
            curveTo(9.222f, 21.781f, 11.278f, 21.78f, 12.547f, 20.513f)
            lineTo(12.641f, 20.419f)
            curveTo(11.628f, 19.421f, 11f, 18.034f, 11f, 16.5f)
            curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
            curveTo(18.034f, 11f, 19.42f, 11.628f, 20.418f, 12.64f)
            lineTo(21.048f, 12.01f)
            curveTo(21.657f, 11.4f, 22f, 10.574f, 22f, 9.712f)
            verticalLineTo(4.25f)
            close()
            moveTo(15.5f, 7.002f)
            curveTo(15.5f, 6.174f, 16.171f, 5.502f, 17f, 5.502f)
            curveTo(17.828f, 5.502f, 18.5f, 6.174f, 18.5f, 7.002f)
            curveTo(18.5f, 7.831f, 17.828f, 8.502f, 17f, 8.502f)
            curveTo(16.171f, 8.502f, 15.5f, 7.831f, 15.5f, 7.002f)
            close()
            moveTo(20.168f, 19.107f)
            curveTo(20.692f, 18.372f, 21f, 17.472f, 21f, 16.5f)
            curveTo(21f, 14.015f, 18.985f, 12f, 16.5f, 12f)
            curveTo(14.015f, 12f, 12f, 14.015f, 12f, 16.5f)
            curveTo(12f, 18.985f, 14.015f, 21f, 16.5f, 21f)
            curveTo(17.472f, 21f, 18.372f, 20.692f, 19.107f, 20.168f)
            lineTo(21.72f, 22.78f)
            curveTo(22.013f, 23.073f, 22.487f, 23.073f, 22.78f, 22.78f)
            curveTo(23.073f, 22.487f, 23.073f, 22.013f, 22.78f, 21.72f)
            lineTo(20.168f, 19.107f)
            close()
            moveTo(19.5f, 16.5f)
            curveTo(19.5f, 18.157f, 18.157f, 19.5f, 16.5f, 19.5f)
            curveTo(14.843f, 19.5f, 13.5f, 18.157f, 13.5f, 16.5f)
            curveTo(13.5f, 14.843f, 14.843f, 13.5f, 16.5f, 13.5f)
            curveTo(18.157f, 13.5f, 19.5f, 14.843f, 19.5f, 16.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TagSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TagSearch, contentDescription = null)
    }
}
