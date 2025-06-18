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

public val FluentIcons.Filled.Vault: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Vault",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 13.5f)
            curveTo(14.828f, 13.5f, 15.5f, 12.828f, 15.5f, 12f)
            curveTo(15.5f, 11.172f, 14.828f, 10.5f, 14f, 10.5f)
            curveTo(13.172f, 10.5f, 12.5f, 11.172f, 12.5f, 12f)
            curveTo(12.5f, 12.828f, 13.172f, 13.5f, 14f, 13.5f)
            close()
            moveTo(2f, 7.75f)
            curveTo(2f, 5.679f, 3.679f, 4f, 5.75f, 4f)
            horizontalLineTo(18.25f)
            curveTo(20.321f, 4f, 22f, 5.679f, 22f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(22f, 18.321f, 20.321f, 20f, 18.25f, 20f)
            horizontalLineTo(5.75f)
            curveTo(3.679f, 20f, 2f, 18.321f, 2f, 16.25f)
            verticalLineTo(7.75f)
            close()
            moveTo(5.75f, 7f)
            curveTo(5.336f, 7f, 5f, 7.336f, 5f, 7.75f)
            verticalLineTo(16.25f)
            curveTo(5f, 16.664f, 5.336f, 17f, 5.75f, 17f)
            curveTo(6.164f, 17f, 6.5f, 16.664f, 6.5f, 16.25f)
            verticalLineTo(7.75f)
            curveTo(6.5f, 7.336f, 6.164f, 7f, 5.75f, 7f)
            close()
            moveTo(11.28f, 8.22f)
            curveTo(10.987f, 7.927f, 10.513f, 7.927f, 10.22f, 8.22f)
            curveTo(9.927f, 8.513f, 9.927f, 8.987f, 10.22f, 9.28f)
            lineTo(11.415f, 10.476f)
            curveTo(11.151f, 10.923f, 11f, 11.444f, 11f, 12f)
            curveTo(11f, 12.556f, 11.151f, 13.077f, 11.415f, 13.524f)
            lineTo(10.22f, 14.72f)
            curveTo(9.927f, 15.013f, 9.927f, 15.487f, 10.22f, 15.78f)
            curveTo(10.513f, 16.073f, 10.987f, 16.073f, 11.28f, 15.78f)
            lineTo(12.476f, 14.585f)
            curveTo(12.923f, 14.849f, 13.444f, 15f, 14f, 15f)
            curveTo(14.556f, 15f, 15.077f, 14.849f, 15.524f, 14.585f)
            lineTo(16.72f, 15.78f)
            curveTo(17.013f, 16.073f, 17.487f, 16.073f, 17.78f, 15.78f)
            curveTo(18.073f, 15.487f, 18.073f, 15.013f, 17.78f, 14.72f)
            lineTo(16.585f, 13.524f)
            curveTo(16.849f, 13.077f, 17f, 12.556f, 17f, 12f)
            curveTo(17f, 11.444f, 16.849f, 10.923f, 16.585f, 10.476f)
            lineTo(17.78f, 9.28f)
            curveTo(18.073f, 8.987f, 18.073f, 8.513f, 17.78f, 8.22f)
            curveTo(17.487f, 7.927f, 17.013f, 7.927f, 16.72f, 8.22f)
            lineTo(15.524f, 9.415f)
            curveTo(15.077f, 9.151f, 14.556f, 9f, 14f, 9f)
            curveTo(13.444f, 9f, 12.923f, 9.151f, 12.476f, 9.415f)
            lineTo(11.28f, 8.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VaultPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Vault, contentDescription = null)
    }
}
