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

public val FluentIcons.Regular.PeopleCommunity: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleCommunity",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4.5f)
            curveTo(11.033f, 4.5f, 10.25f, 5.284f, 10.25f, 6.25f)
            curveTo(10.25f, 7.216f, 11.033f, 8f, 12f, 8f)
            curveTo(12.967f, 8f, 13.75f, 7.216f, 13.75f, 6.25f)
            curveTo(13.75f, 5.284f, 12.967f, 4.5f, 12f, 4.5f)
            close()
            moveTo(8.75f, 6.25f)
            curveTo(8.75f, 4.455f, 10.205f, 3f, 12f, 3f)
            curveTo(13.795f, 3f, 15.25f, 4.455f, 15.25f, 6.25f)
            curveTo(15.25f, 8.045f, 13.795f, 9.5f, 12f, 9.5f)
            curveTo(10.205f, 9.5f, 8.75f, 8.045f, 8.75f, 6.25f)
            close()
            moveTo(5f, 6.5f)
            curveTo(4.172f, 6.5f, 3.5f, 7.172f, 3.5f, 8f)
            curveTo(3.5f, 8.828f, 4.172f, 9.5f, 5f, 9.5f)
            curveTo(5.828f, 9.5f, 6.5f, 8.828f, 6.5f, 8f)
            curveTo(6.5f, 7.172f, 5.828f, 6.5f, 5f, 6.5f)
            close()
            moveTo(2f, 8f)
            curveTo(2f, 6.343f, 3.343f, 5f, 5f, 5f)
            curveTo(6.657f, 5f, 8f, 6.343f, 8f, 8f)
            curveTo(8f, 9.657f, 6.657f, 11f, 5f, 11f)
            curveTo(3.343f, 11f, 2f, 9.657f, 2f, 8f)
            close()
            moveTo(17.5f, 8f)
            curveTo(17.5f, 7.172f, 18.172f, 6.5f, 19f, 6.5f)
            curveTo(19.828f, 6.5f, 20.5f, 7.172f, 20.5f, 8f)
            curveTo(20.5f, 8.828f, 19.828f, 9.5f, 19f, 9.5f)
            curveTo(18.172f, 9.5f, 17.5f, 8.828f, 17.5f, 8f)
            close()
            moveTo(19f, 5f)
            curveTo(17.343f, 5f, 16f, 6.343f, 16f, 8f)
            curveTo(16f, 9.657f, 17.343f, 11f, 19f, 11f)
            curveTo(20.657f, 11f, 22f, 9.657f, 22f, 8f)
            curveTo(22f, 6.343f, 20.657f, 5f, 19f, 5f)
            close()
            moveTo(7.5f, 12.75f)
            curveTo(7.5f, 11.783f, 8.283f, 11f, 9.25f, 11f)
            horizontalLineTo(14.75f)
            curveTo(15.717f, 11f, 16.5f, 11.783f, 16.5f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(16.5f, 18.985f, 14.485f, 21f, 12f, 21f)
            curveTo(9.515f, 21f, 7.5f, 18.985f, 7.5f, 16.5f)
            verticalLineTo(12.75f)
            close()
            moveTo(9.25f, 12.5f)
            curveTo(9.112f, 12.5f, 9f, 12.612f, 9f, 12.75f)
            verticalLineTo(16.5f)
            curveTo(9f, 18.157f, 10.343f, 19.5f, 12f, 19.5f)
            curveTo(13.657f, 19.5f, 15f, 18.157f, 15f, 16.5f)
            verticalLineTo(12.75f)
            curveTo(15f, 12.612f, 14.888f, 12.5f, 14.75f, 12.5f)
            horizontalLineTo(9.25f)
            close()
            moveTo(6.61f, 11.978f)
            curveTo(6.538f, 12.223f, 6.5f, 12.482f, 6.5f, 12.75f)
            verticalLineTo(13.56f)
            lineTo(3.686f, 14.314f)
            curveTo(3.552f, 14.35f, 3.473f, 14.487f, 3.509f, 14.62f)
            lineTo(4.221f, 17.277f)
            curveTo(4.604f, 18.706f, 5.957f, 19.617f, 7.382f, 19.489f)
            curveTo(7.697f, 19.975f, 8.087f, 20.408f, 8.535f, 20.771f)
            curveTo(8.452f, 20.799f, 8.368f, 20.824f, 8.283f, 20.847f)
            curveTo(5.883f, 21.49f, 3.415f, 20.065f, 2.772f, 17.665f)
            lineTo(2.06f, 15.009f)
            curveTo(1.81f, 14.075f, 2.364f, 13.115f, 3.297f, 12.865f)
            lineTo(6.61f, 11.978f)
            close()
            moveTo(15.465f, 20.771f)
            curveTo(15.548f, 20.799f, 15.633f, 20.824f, 15.718f, 20.847f)
            curveTo(18.119f, 21.49f, 20.586f, 20.065f, 21.229f, 17.665f)
            lineTo(21.941f, 15.009f)
            curveTo(22.191f, 14.075f, 21.637f, 13.115f, 20.704f, 12.865f)
            lineTo(17.39f, 11.977f)
            curveTo(17.462f, 12.222f, 17.5f, 12.482f, 17.5f, 12.75f)
            verticalLineTo(13.56f)
            lineTo(20.316f, 14.314f)
            curveTo(20.449f, 14.35f, 20.528f, 14.487f, 20.492f, 14.62f)
            lineTo(19.781f, 17.277f)
            curveTo(19.397f, 18.706f, 18.043f, 19.617f, 16.618f, 19.489f)
            curveTo(16.303f, 19.975f, 15.913f, 20.407f, 15.465f, 20.771f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleCommunityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleCommunity, contentDescription = null)
    }
}
