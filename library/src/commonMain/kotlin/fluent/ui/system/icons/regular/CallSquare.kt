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
package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.CallSquare: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallSquare",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(4.5f, 6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(7.904f, 9.777f)
            curveTo(8.978f, 9.289f, 10.427f, 9f, 12f, 9f)
            curveTo(13.573f, 9f, 15.022f, 9.289f, 16.096f, 9.777f)
            curveTo(17.125f, 10.245f, 18f, 10.993f, 18f, 12f)
            verticalLineTo(13.503f)
            curveTo(18f, 14.381f, 17.25f, 15.071f, 16.375f, 14.998f)
            lineTo(15.198f, 14.9f)
            curveTo(14.539f, 14.845f, 13.994f, 14.365f, 13.856f, 13.719f)
            lineTo(13.573f, 12.394f)
            curveTo(13.563f, 12.346f, 13.548f, 12.314f, 13.537f, 12.297f)
            curveTo(13.532f, 12.288f, 13.528f, 12.284f, 13.526f, 12.283f)
            curveTo(13.525f, 12.282f, 13.524f, 12.281f, 13.524f, 12.281f)
            curveTo(13.322f, 12.176f, 12.858f, 12f, 12f, 12f)
            curveTo(11.142f, 12f, 10.678f, 12.176f, 10.476f, 12.281f)
            curveTo(10.476f, 12.281f, 10.475f, 12.281f, 10.474f, 12.283f)
            curveTo(10.472f, 12.284f, 10.468f, 12.288f, 10.463f, 12.297f)
            curveTo(10.452f, 12.314f, 10.437f, 12.346f, 10.427f, 12.394f)
            lineTo(10.144f, 13.719f)
            curveTo(10.006f, 14.365f, 9.461f, 14.845f, 8.802f, 14.9f)
            lineTo(7.625f, 14.998f)
            curveTo(6.75f, 15.071f, 6f, 14.381f, 6f, 13.503f)
            verticalLineTo(12f)
            curveTo(6f, 10.993f, 6.875f, 10.245f, 7.904f, 9.777f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CallSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallSquare, contentDescription = null)
    }
}
