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

public val FluentUi.Filled.PeopleCommunity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PeopleCommunity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.75f, 6.25f)
            curveTo(8.75f, 4.455f, 10.205f, 3f, 12f, 3f)
            curveTo(13.795f, 3f, 15.25f, 4.455f, 15.25f, 6.25f)
            curveTo(15.25f, 8.045f, 13.795f, 9.5f, 12f, 9.5f)
            curveTo(10.205f, 9.5f, 8.75f, 8.045f, 8.75f, 6.25f)
            close()
            moveTo(5f, 5f)
            curveTo(3.343f, 5f, 2f, 6.343f, 2f, 8f)
            curveTo(2f, 9.657f, 3.343f, 11f, 5f, 11f)
            curveTo(6.657f, 11f, 8f, 9.657f, 8f, 8f)
            curveTo(8f, 6.343f, 6.657f, 5f, 5f, 5f)
            close()
            moveTo(19f, 5f)
            curveTo(17.343f, 5f, 16f, 6.343f, 16f, 8f)
            curveTo(16f, 9.657f, 17.343f, 11f, 19f, 11f)
            curveTo(20.657f, 11f, 22f, 9.657f, 22f, 8f)
            curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
            close()
            moveTo(9.25f, 11f)
            curveTo(8.283f, 11f, 7.5f, 11.783f, 7.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(7.5f, 18.985f, 9.515f, 21f, 12f, 21f)
            curveTo(14.485f, 21f, 16.5f, 18.985f, 16.5f, 16.5f)
            verticalLineTo(12.75f)
            curveTo(16.5f, 11.783f, 15.717f, 11f, 14.75f, 11f)
            horizontalLineTo(9.25f)
            close()
            moveTo(6.61f, 11.978f)
            curveTo(6.538f, 12.223f, 6.5f, 12.482f, 6.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(6.5f, 18.224f, 7.293f, 19.763f, 8.535f, 20.771f)
            curveTo(8.452f, 20.799f, 8.368f, 20.824f, 8.283f, 20.847f)
            curveTo(5.883f, 21.49f, 3.415f, 20.065f, 2.772f, 17.665f)
            lineTo(2.06f, 15.009f)
            curveTo(1.81f, 14.075f, 2.364f, 13.115f, 3.297f, 12.865f)
            lineTo(6.61f, 11.978f)
            close()
            moveTo(15.465f, 20.771f)
            curveTo(16.707f, 19.763f, 17.5f, 18.224f, 17.5f, 16.5f)
            verticalLineTo(12.75f)
            curveTo(17.5f, 12.482f, 17.462f, 12.222f, 17.39f, 11.977f)
            lineTo(20.704f, 12.865f)
            curveTo(21.637f, 13.115f, 22.191f, 14.075f, 21.941f, 15.009f)
            lineTo(21.229f, 17.665f)
            curveTo(20.586f, 20.065f, 18.119f, 21.49f, 15.718f, 20.847f)
            curveTo(15.633f, 20.824f, 15.548f, 20.799f, 15.465f, 20.771f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleCommunityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PeopleCommunity, contentDescription = null)
    }
}
