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

public val FluentIcons.Filled.PeopleStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 11f)
            curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
            curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
            curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
            curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
            close()
            moveTo(17f, 11f)
            curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
            curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
            curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
            curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
            close()
            moveTo(4.25f, 13f)
            curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
            verticalLineTo(15.5f)
            curveTo(2f, 15.5f, 2f, 20f, 8f, 20f)
            curveTo(9.39f, 20f, 10.458f, 19.758f, 11.278f, 19.388f)
            curveTo(11.097f, 18.79f, 11f, 18.156f, 11f, 17.5f)
            curveTo(11f, 15.843f, 11.62f, 14.331f, 12.641f, 13.183f)
            curveTo(12.367f, 13.065f, 12.066f, 13f, 11.75f, 13f)
            horizontalLineTo(4.25f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(18.055f, 14.421f)
            curveTo(17.881f, 13.86f, 17.119f, 13.86f, 16.945f, 14.421f)
            lineTo(16.388f, 16.208f)
            horizontalLineTo(14.585f)
            curveTo(14.019f, 16.208f, 13.784f, 16.962f, 14.242f, 17.309f)
            lineTo(15.7f, 18.413f)
            lineTo(15.143f, 20.2f)
            curveTo(14.968f, 20.761f, 15.584f, 21.228f, 16.042f, 20.881f)
            lineTo(17.5f, 19.777f)
            lineTo(18.958f, 20.881f)
            curveTo(19.416f, 21.228f, 20.032f, 20.761f, 19.857f, 20.2f)
            lineTo(19.3f, 18.413f)
            lineTo(20.758f, 17.309f)
            curveTo(21.216f, 16.962f, 20.981f, 16.208f, 20.415f, 16.208f)
            horizontalLineTo(18.612f)
            lineTo(18.055f, 14.421f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleStar, contentDescription = null)
    }
}
