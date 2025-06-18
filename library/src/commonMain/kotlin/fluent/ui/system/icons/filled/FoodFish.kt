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

public val FluentIcons.Filled.FoodFish: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FoodFish",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.357f, 4.103f)
            curveTo(9.356f, 5.104f, 8.777f, 6.438f, 8.445f, 7.776f)
            curveTo(8.112f, 9.12f, 8.014f, 10.523f, 8.015f, 11.725f)
            curveTo(8.015f, 11.902f, 7.868f, 12.049f, 7.693f, 12.05f)
            curveTo(5.922f, 12.056f, 3.677f, 12.269f, 1.861f, 13.136f)
            curveTo(1.179f, 13.462f, 0.894f, 14.134f, 1.035f, 14.771f)
            curveTo(1.168f, 15.367f, 1.65f, 15.856f, 2.302f, 16.015f)
            curveTo(3.097f, 16.209f, 4.019f, 16.46f, 4.821f, 16.745f)
            curveTo(5.222f, 16.887f, 5.581f, 17.033f, 5.873f, 17.179f)
            curveTo(6.175f, 17.33f, 6.36f, 17.459f, 6.451f, 17.551f)
            curveTo(6.542f, 17.642f, 6.671f, 17.826f, 6.822f, 18.128f)
            curveTo(6.968f, 18.42f, 7.114f, 18.778f, 7.256f, 19.179f)
            curveTo(7.54f, 19.98f, 7.79f, 20.902f, 7.984f, 21.696f)
            curveTo(8.143f, 22.348f, 8.632f, 22.831f, 9.229f, 22.963f)
            curveTo(9.866f, 23.105f, 10.538f, 22.82f, 10.864f, 22.138f)
            curveTo(11.731f, 20.325f, 11.945f, 18.084f, 11.953f, 16.315f)
            curveTo(11.954f, 16.141f, 12.101f, 15.994f, 12.277f, 15.994f)
            curveTo(13.479f, 15.995f, 14.883f, 15.896f, 16.227f, 15.563f)
            curveTo(17.566f, 15.231f, 18.901f, 14.651f, 19.903f, 13.649f)
            curveTo(21.022f, 12.53f, 21.571f, 11.04f, 21.82f, 9.593f)
            curveTo(22.069f, 8.142f, 22.029f, 6.667f, 21.914f, 5.501f)
            curveTo(21.736f, 3.68f, 20.326f, 2.27f, 18.506f, 2.092f)
            curveTo(17.339f, 1.978f, 15.865f, 1.937f, 14.413f, 2.186f)
            curveTo(12.966f, 2.435f, 11.477f, 2.984f, 10.357f, 4.103f)
            close()
            moveTo(16f, 5f)
            curveTo(16.552f, 5f, 17f, 5.448f, 17f, 6f)
            curveTo(17f, 6.553f, 16.552f, 7f, 16f, 7f)
            curveTo(15.448f, 7f, 15f, 6.553f, 15f, 6f)
            curveTo(15f, 5.448f, 15.448f, 5f, 16f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodFishPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FoodFish, contentDescription = null)
    }
}
